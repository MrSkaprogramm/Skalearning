public class Market {

	public static void main(String[] args) {
		Economy economy = new Economy();
		economy.fillQueue();
		Economy produceEconomy = new Economy();
		Economy consumeEconomy = new Economy();
		
		FactoryOne factoryOne = new FactoryOne();
		factoryOne.producer = produceEconomy;
		FactoryTwo factoryTwo = new FactoryTwo();
		factoryTwo.producer = produceEconomy;
		FactoryThree factoryThree = new FactoryThree();
		factoryThree.producer = produceEconomy;
		ShopOne shopOne = new ShopOne();
		shopOne.consumer = produceEconomy;
		ShopTwo shopTwo = new ShopTwo();
		shopTwo.consumer = produceEconomy;
		
		factoryOne.start();
		factoryTwo.start();
		factoryThree.start();
		shopOne.start();
		shopTwo.start();
	}
}
