public class Product {
	private String toySize;
	private int toyPrice;
	
	public Product(String toySize, int toyPrice) {
		this.toySize = toySize;
		this.toyPrice = toyPrice;
	}
	
	public String getSize() {
		return toySize;
	}
	
	public void setSize(String toySize) {
		this.toySize = toySize;
	}
	
	public int getPrice() {
		return toyPrice;
	}
	
	public void setPrice(int toyPrice) {
		this.toyPrice = toyPrice;
	}
}
