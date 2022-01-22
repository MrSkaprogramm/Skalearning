import java.util.ArrayList;
import java.util.List;

public class Economy {

	private static final int MAX_QUEUE_ELEMENTS = 200;
	private static final int MAX_ELEMENTS_NUMBER = 100;
	private static final int MAX_SATURATION_GOODS = 100;
	private static final int FACTORY_STARTS_SATURATION_GOODS = 80;
	private static final int TOTAL_ECONOMY_CAPACITY = 10000;
	private int economyCapacity;
	private List<Integer> queue_Elements = new ArrayList<>();
	
	public int getEconomy_Capacity() {
		return economyCapacity;
	}

	public void setEconomy_Capacity(int economy_Capacity) {
		this.economyCapacity = economy_Capacity;
	}

	public int getTotalEconomyCapacity() {
		return TOTAL_ECONOMY_CAPACITY;
	}


	public void fillQueue() {
		for(int i = 0; i < MAX_QUEUE_ELEMENTS; i++) {
			queue_Elements.add((int)(Math.random()*MAX_ELEMENTS_NUMBER));
		}
	}

	public synchronized void producingCompany() {
				while(queue_Elements.size() >= MAX_SATURATION_GOODS) {
					try {
						System.out.println("wait produce");
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(queue_Elements.size() + " in queue");
				}
				
				notifyAll();
				queue_Elements.add((int)(Math.random()*MAX_ELEMENTS_NUMBER));
				System.out.println(economyCapacity + " product produced by " + Thread.currentThread().getName() + " factory");
	}
	
	public synchronized void consumingCompany() {
			while(queue_Elements.isEmpty()) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
				
			if(queue_Elements.size() <= FACTORY_STARTS_SATURATION_GOODS) {
				notifyAll();
			}
			
			if(economyCapacity < TOTAL_ECONOMY_CAPACITY) {
				queue_Elements.remove(0);
				economyCapacity++;
				System.out.println(Thread.currentThread().getName());
				System.out.println(economyCapacity + " product consumed by " + Thread.currentThread().getName() + " shop");
		}
	}
}
