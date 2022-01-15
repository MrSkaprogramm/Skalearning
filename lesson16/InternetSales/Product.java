import java.util.Objects;

public class Product {
	private String productName;
	private int amountProducts;
	
	public Product(String productName, int amountProducts) {
		this.productName = productName;
		this.amountProducts = amountProducts;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getAmountProducts() {
		return amountProducts;
	}

	public void setAmountProducts(int amountProducts) {
		this.amountProducts = amountProducts;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amountProducts, productName);
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
		return amountProducts == other.amountProducts && Objects.equals(productName, other.productName);
	}
}
