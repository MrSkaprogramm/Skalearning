public class Product {
	private String productName;
	private int productPrice;
	private double productRating;
	
	public Product(String productName, int productPrice) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.productRating = Math.random()*10 + 1;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public double getProductRating() {
		return productRating;
	}
	public void setProductRating(double productRating) {
		this.productRating = productRating;
	}

	@Override
	public int hashCode() {
		return Objects.hash(productName, productPrice, productRating);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(productName, other.productName) && productPrice == other.productPrice
				&& Double.doubleToLongBits(productRating) == Double.doubleToLongBits(other.productRating);
	}
}
