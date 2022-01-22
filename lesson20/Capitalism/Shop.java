public class Shop extends Thread {
	Economy consumer;

	@Override
	public void run() {
		while(true) {
			consumer.consumingCompany();
			if(consumer.getEconomy_Capacity() >= consumer.getTotalEconomyCapacity()) {
				System.out.println("The economy is working great! You are a wonderful president!");
				return;
			}
		}
	}
}
