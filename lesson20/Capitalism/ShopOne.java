public class ShopOne extends Thread {
	Economy consumer;

	@Override
	public void run() {
		while(true) {
			consumer.consumingCompany();
			if(consumer.getEconomy_Capacity() >= consumer.getTotalEconomyCapacity()) {
				System.out.println("consumer1 returned ");
				return;
			}
		}
	}
}
