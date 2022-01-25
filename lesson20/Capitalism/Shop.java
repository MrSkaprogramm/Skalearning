public class Shop extends Thread {
	private Economy consumer;

	public Economy getConsumer() {
		return consumer;
	}

	public void setConsumer(Economy consumer) {
		this.consumer = consumer;
	}

	@Override
	public void run() {
		while(true) {
			consumer.consumingCompany();
			if(consumer.getEconomyCapacity() >= consumer.getTotalEconomyCapacity()) {
				System.out.println("The economy is working great! You are a wonderful president!");
				return;
			}
		}
	}
}
