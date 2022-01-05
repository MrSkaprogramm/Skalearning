import java.util.Comparator;

public class CatalogReverseSortByName implements Comparator<Product> {
	@Override
	public int compare(Product o, Product o1) {
		if(o.getProductName() != o1.getProductName()) {
			return o1.getProductName().compareTo(o.getProductName());
		}else if(o.getProductPrice() != o1.getProductPrice()){
			return o.getProductPrice() - o1.getProductPrice();
		}else if(o.getProductRating() != o1.getProductRating()){
			return (int)(Math.ceil(o.getProductRating() - o1.getProductRating()));
		}
		return 0;
	}
}
