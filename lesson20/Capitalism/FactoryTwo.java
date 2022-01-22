public class FactoryTwo extends Thread {
	Economy producer;

	@Override
	public void run() {
		while(true) {
			producer.producingCompany();
			if(producer.getEconomy_Capacity() >= producer.getTotalEconomyCapacity()) {
				System.out.println("produce2 returned ");
				return;
			}
		}
	}
}
