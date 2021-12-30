import java.util.Map;

public interface ProductService {
	public Product newToy(int costPrice, int toyAmount, int productionTime);
	
	public void addToys(Map<String, Product> toys, String toyName, Product toy);
	
	public void printToysEntrySet(Map<String, Product> toys);
	
	public void printToysKeySet(Map<String, Product> toys);
	
	public void printToysValues(Map<String, Product> toys);
}
