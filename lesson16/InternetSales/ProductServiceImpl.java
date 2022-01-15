import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductServiceImpl implements ProductService {
	Scanner sc = new Scanner(System.in);
	
	@Override
	public Product newProduct(String product, int amountProduct) {
		return new Product(product, amountProduct);
	}

	@Override
	public void addData(Map<String, Map<String, Integer>> dataMap, List<Product> products) {
		String customer;
		String product = null;
		int amountProducts;
		for(int i = 0; i < 3; i++) {
			products.clear();
			System.out.println("Customer:");
			customer = sc.nextLine();
			for(int j = 0; j < 3; j++) {
				System.out.println("Product:");
					product = sc.nextLine();
				System.out.println("Amount of product:");
				amountProducts = Integer.parseInt(sc.nextLine());
				addProduct(products, product, amountProducts);
			}
			Map<String, Integer>productsMap = sortProducts(products);
			collectData(dataMap, customer, productsMap);
			System.out.println();
		}
	}

	@Override
	public void addProduct(List<Product> products, String product, int amountProduct) {
		products.add(newProduct(product, amountProduct));
	}

	@Override
	public Map<String, Integer> sortProducts(List<Product> products) {
		Map<String, Integer>productsMap = new TreeMap<>(new SortCustomers());
		for(int i = 0; i < products.size(); i++) {
			productsMap.put(products.get(i).getProductName(), products.get(i).getAmountProducts());
		}
		return productsMap;
	}

	@Override
	public void collectData(Map<String, Map<String, Integer>> dataMap, String customer, Map<String, Integer> productsMap) {
		dataMap.put(customer, productsMap);
		
	}

	@Override
	public void viewData(Map<String, Map<String, Integer>> dataMap) {
		Map<String, Map<String, Integer>>viewDataMap = new TreeMap<>(new SortCustomers());
		viewDataMap.putAll(dataMap);
		for(Map.Entry<String, Map<String, Integer>> customersMap : viewDataMap.entrySet()) {
			System.out.println("Customer: " + customersMap.getKey());
			for(Map.Entry<String, Integer> productsEntry : customersMap.getValue().entrySet()) {
				System.out.print("Product: " + productsEntry.getKey() + " Amount of products: " + productsEntry.getValue() + "\n");
			}
		}
	}
}
