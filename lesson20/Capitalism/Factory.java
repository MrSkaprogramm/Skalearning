public class Factory extends Thread {
	Economy producer;

	@Override
	public void run() {
		while(true) {
			producer.producingCompany();
			if(producer.getEconomy_Capacity() >= producer.getTotalEconomyCapacity()) {
				System.out.println("The economy is working great! You are a wonderful president!");
				return;
			}
		}
	}
}
