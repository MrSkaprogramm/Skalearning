import java.util.Comparator;

public class CatalogReverseSortByRating implements Comparator<Product> {
	@Override
	public int compare(Product o, Product o1) {
		if(o.getProductRating() != o1.getProductRating()) {
			return (int)(Math.ceil(o1.getProductRating() - o.getProductRating()));
		}else if(o.getProductName() != o1.getProductName()){
			return o.getProductName().compareTo(o1.getProductName());
		}else if(o.getProductPrice() != o1.getProductPrice()){
			return o.getProductPrice() - o1.getProductPrice();
		}
		return 0;
	}
}
