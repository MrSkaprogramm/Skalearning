import java.util.HashMap;
import java.util.Map;

public class ToyFactory {

	public static void main(String[] args) {
		ProductServiceImpl toyFactory = new ProductServiceImpl();
		
		Map<String, Product> toys = new HashMap<>();
		
		toyFactory.addToys(toys, "Radio-controller car", toyFactory.newToy(20, 2240, 20));
		toyFactory.addToys(toys, "Radio-controller boat", toyFactory.newToy(30, 2240, 40));
		toyFactory.addToys(toys, "Quadcopter", toyFactory.newToy(50, 1000, 100));
		toyFactory.addToys(toys, "Helicopter", toyFactory.newToy(40, 850, 110));
		toyFactory.addToys(toys, "Telescope", toyFactory.newToy(100, 300, 200));
		toyFactory.addToys(toys, "Guardsmen", toyFactory.newToy(5, 8000, 100));
		toyFactory.addToys(toys, "Pony horse", toyFactory.newToy(10, 4000, 60));
		toyFactory.addToys(toys, "LEGO Constructor", toyFactory.newToy(90, 700, 40));
		toyFactory.addToys(toys, "Monopoly", toyFactory.newToy(10, 1850, 30));
		
		toyFactory.printToysEntrySet(toys);
		toyFactory.printToysKeySet(toys);
		toyFactory.printToysValues(toys);
	}
}
