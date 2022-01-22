import java.util.ArrayList;
import java.util.List;

public class Economy {

	private static final int MAX_QUEUE_ELEMENTS = 200;
	private static final int MAX_ELEMENTS_NUMBER = 100;
	private static final int MAX_SATURATION_GOODS = 100;
	private static final int FACTORY_STARTS_SATURATION_GOODS = 80;
	private static final int TOTAL_ECONOMY_CAPACITY = 10000;
	private static int economy_Capacity;
	private static List<Integer> queue_Elements = new ArrayList<>();
	
	public int getEconomy_Capacity() {
		return economy_Capacity;
	}

	public void setEconomy_Capacity(int economy_Capacity) {
		Economy.economy_Capacity = economy_Capacity;
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
			System.out.println("produce1 " + Thread.currentThread().getName());
				System.out.println("produce2 " + Thread.currentThread().getName());
				while(queue_Elements.size() >= MAX_SATURATION_GOODS) {
					System.out.println("produce3 " + Thread.currentThread().getName());
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
					System.out.println(economy_Capacity + " product produced | " + queue_Elements.size() + " in queue");
	}

	public synchronized void consumingCompany() {
		if(economy_Capacity < TOTAL_ECONOMY_CAPACITY) {
				System.out.println("consumer1 " + Thread.currentThread().getName());
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
				
					queue_Elements.remove(0);
					economy_Capacity++;
					System.out.println(Thread.currentThread().getName());
					System.out.println(economy_Capacity + " product consumed | " + queue_Elements.size() + " in queue");
		}
	}
}
