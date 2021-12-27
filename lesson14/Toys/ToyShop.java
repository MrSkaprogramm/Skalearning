import java.util.HashMap;
import java.util.Map;

public class ToyShop {

	public static void main(String[] args) {
		ProductServiceImpl shopService = new ProductServiceImpl();
		
		Map<String, Product> toyShop = new HashMap<>();
		
		shopService.addToy(toyShop, "Car", shopService.newProduct("Medium", 100));
		shopService.addToy(toyShop, "Airplane", shopService.newProduct("Big", 200));
		shopService.addToy(toyShop, "Constructor LEGO", shopService.newProduct("Big", 700));
		shopService.addToy(toyShop, "Robot Terminator", shopService.newProduct("Big", 300));
		shopService.addToy(toyShop, "Barby doll", shopService.newProduct("Small", 100));
		
		shopService.showToysEntrySet(toyShop);
		shopService.showToysKeySet(toyShop);
		shopService.showToysValues(toyShop);
	}
}
