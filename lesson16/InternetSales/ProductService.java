import java.util.List;
import java.util.Map;

public interface ProductService {
	public Product newProduct(String product, int amountProduct);
	
	public void addData(Map<String, Map<String, Integer>> dataMap, List<Product> products);
	
	public void addProduct(List<Product> products, String product, int amountProduct);
	
	public Map<String, Integer> sortProducts(List<Product> products);
	
	public void collectData(Map<String, Map<String, Integer>> dataMap, String customer, Map<String, Integer> productsMap);
	
	public void viewData(Map<String, Map<String, Integer>> dataMap);
}
