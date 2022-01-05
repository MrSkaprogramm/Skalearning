import java.util.HashSet;
import java.util.Set;

public class OnlineShop {

	public static void main(String[] args) {
		ProductServiceImpl shop = new ProductServiceImpl();
		Set<Product> catalog = new 	HashSet<Product>();

		shop.addProduct(catalog, shop.newProduct("Laptop", 1500));
		shop.addProduct(catalog, shop.newProduct("Smartphone", 1000));
		shop.addProduct(catalog, shop.newProduct("LEGO Constructor", 40));
		shop.addProduct(catalog, shop.newProduct("RC car", 150));
		shop.addProduct(catalog, shop.newProduct("Stand fan", 30));
		shop.addProduct(catalog, shop.newProduct("Cup", 10));
		shop.addProduct(catalog, shop.newProduct("DVD - player", 100));
		shop.addProduct(catalog, shop.newProduct("Car battery", 80));
		shop.addProduct(catalog, shop.newProduct("Coat", 200));
		shop.addProduct(catalog, shop.newProduct("Sun lounger", 170));
		
		shop.welcomeOption(catalog);
	}
}
