import java.util.Comparator;

public class CatalogSortByRating implements Comparator<Product> {

	@Override
	public int compare(Product o, Product o1) {
		if(o.getProductRating() != o1.getProductRating()) {
			return (int)(Math.ceil(o.getProductRating() - o1.getProductRating()));
		}else if(o.getProductName() != o1.getProductName()){
			return o.getProductName().compareTo(o1.getProductName());
		}else if(o.getProductPrice() != o1.getProductPrice()){
			return o.getProductPrice() - o1.getProductPrice();
		}
		return 0;
	}
}
