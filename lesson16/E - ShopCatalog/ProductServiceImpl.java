import java.util.Collection;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ProductServiceImpl implements ProductService {
	
	@Override
	public void welcomeOption(Set<Product> catalog) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to our online shop! \n What criteria of product is more important for you?" +
				" \n Press 1 if price is more important for you \n Press 2 if customer's rating is more important for you " +
				"or press any another number to see all product catalog:");
		int choise = sc.nextInt();
		int criteria;
		
		do {
			System.out.println("Choose how you wants to see catalog: \n Press 1 From smaller to larger \n Press 2 From larger to smaller");
			criteria = sc.nextInt();
		}while(criteria < 1 || criteria > 2);
		
		if(choise == 1 && criteria == 1) {
			sortProductsByPrice(catalog);
		}else if(choise == 1 && criteria == 2) {
			reverseSortProductsByPrice(catalog);
		}else if(choise == 2 && criteria == 1){
			sortProductsByRating(catalog);
		}else if(choise == 2 && criteria == 2) {
			reverseSortProductsByRating(catalog);
		}else if(criteria == 1) {
			sortProductsByName(catalog);
		}else if(criteria == 2) {
			reverseSortProductsByName(catalog);
		}
		sc.close();
	}

	@Override
	public Product newProduct(String productName, int productPrice) {
		return new Product(productName, productPrice);
	}

	@Override
	public void addProduct(Set<Product> catalog, Product product) {
		catalog.add(product);
	}

	@Override
	public void sortProductsByName(Set<Product> catalog) {
		Set<Product> sortedCatalog = new TreeSet<>(new CatalogSortByName());
		sortedCatalog.addAll(catalog);
		viewProducts(sortedCatalog);
	}

	@Override
	public void sortProductsByPrice(Set<Product> catalog) {
		Set<Product> sortedCatalog = new TreeSet<>(new CatalogSortByPrice());
		sortedCatalog.addAll(catalog);
		viewProducts(sortedCatalog);
	}

	@Override
	public void sortProductsByRating(Set<Product> catalog) {
		Set<Product> sortedCatalog = new TreeSet<>(new CatalogSortByRating());
		sortedCatalog.addAll(catalog);
		viewProducts(sortedCatalog);
	}
	
	public void viewProducts(Collection<Product> catalog) {
		for(Product product : catalog) {
			System.out.println(product.getProductName() + ": price - " + product.getProductPrice() +  "$ " + product.getProductRating() + " - points of rating");
		}
	}

	@Override
	public void reverseSortProductsByName(Set<Product> catalog) {
		Set<Product> sortedCatalog = new TreeSet<>(new CatalogReverseSortByName());
		sortedCatalog.addAll(catalog);
		viewProducts(sortedCatalog);
	}

	@Override
	public void reverseSortProductsByPrice(Set<Product> catalog) {
		Set<Product> sortedCatalog = new TreeSet<>(new CatalogReverseSortByPrice());
		sortedCatalog.addAll(catalog);
		viewProducts(sortedCatalog);
	}

	@Override
	public void reverseSortProductsByRating(Set<Product> catalog) {
		Set<Product> sortedCatalog = new TreeSet<>(new CatalogReverseSortByRating());
		sortedCatalog.addAll(catalog);
		viewProducts(sortedCatalog);
	}
}
