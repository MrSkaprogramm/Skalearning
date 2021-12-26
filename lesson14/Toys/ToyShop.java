import java.util.HashMap;
import java.util.Map;

public class ToyShop {

	public static void main(String[] args) {
		ToyShop shop = new ToyShop();
		
		Map<String, Product> toyShop = new HashMap<>();
		Product toy1 = new Product("Medium", 100);
		Product toy2 = new Product("Big", 200);
		Product toy3 = new Product("Big", 700);
		Product toy4 = new Product("Big", 300);
		Product toy5 = new Product("Small", 100);
		
		toyShop.put("Car", toy1);
		toyShop.put("Airplane", toy2);
		toyShop.put("Constructor LEGO", toy3);
		toyShop.put("Robot Terminator", toy4);
		toyShop.put("Barby doll", toy5);
		
		shop.showToysEntrySet(toyShop);
		shop.showToysKeySet(toyShop);
		shop.showToysValues(toyShop);
	}
	
	public void showToysEntrySet(Map<String, Product> toyShop) {
		for(Map.Entry<String, Product> entry : toyShop.entrySet()) {
			System.out.println("Name of toy: " + entry.getKey() + " | Toy's object: " + entry.getValue().getClass());
		}
		System.out.println("----------------");
	}
	
	public void showToysKeySet(Map<String, Product> toyShop) {
		for(String toy : toyShop.keySet()) {
			System.out.println("Name of toy: " + toy);
		}
		System.out.println("----------------");
	}

	public void showToysValues(Map<String, Product> toyShop) {
		for(Product toy : toyShop.values()) {
			System.out.println("Toy size value: " + toy.getSize() + " | Toy price value: " + toy.getPrice() + "$");
		}
		System.out.println("----------------");
	}
}
