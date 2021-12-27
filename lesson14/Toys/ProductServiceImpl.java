import java.util.Map;

public class ProductServiceImpl implements ProductService {
	@Override
	public Product newProduct(String toySize, int toyPrice) {
		return new Product(toySize, toyPrice);
	}

	@Override
	public void addToy(Map<String, Product> toyShop, String toyName, Product toy) {
		toyShop.put(toyName, toy);
		
	}

	@Override
	public void showToysEntrySet(Map<String, Product> toyShop) {
		for(Map.Entry<String, Product> entry : toyShop.entrySet()) {
			System.out.println("Name of toy: " + entry.getKey() + " | Toy's object: " + entry.getValue().getClass());
		}
		System.out.println("----------------");
		
	}

	@Override
	public void showToysKeySet(Map<String, Product> toyShop) {
		for(String toy : toyShop.keySet()) {
			System.out.println("Name of toy: " + toy);
		}
		System.out.println("----------------");
		
	}

	@Override
	public void showToysValues(Map<String, Product> toyShop) {
		for(Product toy : toyShop.values()) {
			System.out.println("Toy size value: " + toy.getSize() + " | Toy price value: " + toy.getPrice() + "$");
		}
		System.out.println("----------------");
		
	}
}
