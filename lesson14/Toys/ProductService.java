import java.util.Map;

public interface ProductService {
	public Product newProduct(String toySize, int toyPrice);
	
	public void addToy(Map<String, Product> toyShop, String toyName, Product toy);
	
	public void showToysEntrySet(Map<String, Product> toyShop);
	
	public void showToysKeySet(Map<String, Product> toyShop);
	
	public void showToysValues(Map<String, Product> toyShop);
}
