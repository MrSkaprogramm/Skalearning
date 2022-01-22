public class Market {

	public static void main(String[] args) {
		Economy economy = new Economy();
		economy.fillQueue();
		
		for(int i = 0; i < 3; i++) {
			Factory factory = new Factory();
			factory.producer = economy;
			factory.start();
		}
		
		for(int i = 0; i < 2; i++) {
			Shop shop = new Shop();
			shop.consumer = economy;
			shop.start();
		}
	}
}
