public class Factory extends Thread {
	private Economy producer;
	
	public Economy getProducer() {
		return producer;
	}

	public void setProducer(Economy producer) {
		this.producer = producer;
	}

	@Override
	public void run() {
		while(true) {
			producer.producingCompany();
			if(producer.getEconomyCapacity() >= producer.getTotalEconomyCapacity()) {
				System.out.println("The economy is working great! You are a wonderful president!");
				return;
			}
		}
	}
}
