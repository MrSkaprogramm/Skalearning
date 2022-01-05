import java.util.Collection;
import java.util.Set;

public interface ProductService {
	public void welcomeOption(Set<Product> catalog);
	
	public Product newProduct(String productName, int productPrice);
	
	public void addProduct(Set<Product> catalog, Product product);
	
	public void viewProducts(Collection<Product> catalog);
	
	public void sortProductsByName(Set<Product> catalog);
	
	public void sortProductsByPrice(Set<Product> catalog);
	
	public void sortProductsByRating(Set<Product> catalog);
	
	public void reverseSortProductsByName(Set<Product> catalog);
	
	public void reverseSortProductsByPrice(Set<Product> catalog);
	
	public void reverseSortProductsByRating(Set<Product> catalog);
}
