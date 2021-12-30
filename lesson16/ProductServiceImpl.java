import java.util.Map;

public class ProductServiceImpl implements ProductService {

	@Override
	public Product newToy(int costPrice, int toyAmount, int productionTime) {
		return new Product(costPrice, toyAmount, productionTime);
	}

	@Override
	public void addToys(Map<String, Product> toys, String toyName, Product toy) {
		toys.put(toyName, toy);
		
	}

	@Override
	public void printToysEntrySet(Map<String, Product> toys) {
		for(Map.Entry<String, Product> currentToy : toys.entrySet()) {
			System.out.println("Name of toy: " + currentToy.getKey() + " | Toy's object: " + currentToy.getValue().getClass());
		}
		System.out.println("----------------");
	}

	@Override
	public void printToysKeySet(Map<String, Product> toys) {
		for(String currentName : toys.keySet()) {
			System.out.println("Name of toy: " + currentName);
		}
		System.out.println("----------------");
	}

	@Override
	public void printToysValues(Map<String, Product> toys) {
		for(Product currentObject : toys.values()) {
			System.out.println("Toy's cost price: " + currentObject.getCostPrice() + "$ | Total toy's production time: " + currentObject.getProductionTime() + " hours | Total amount of toys: " + currentObject.getToyAmount());
		}	
	}
}
