public class FactoryOne extends Thread {
	Economy producer;

	@Override
	public void run() {
		while(true) {
			producer.producingCompany();
			if(producer.getEconomy_Capacity() >= producer.getTotalEconomyCapacity()) {
				System.out.println("produce1 returned ");
				return;
			}
		}
	}
}
