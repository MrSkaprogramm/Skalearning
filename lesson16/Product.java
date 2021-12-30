public class Product {
	private int costPrice;
	private int toyAmount;
	private int productionTime;
	
	public Product(int costPrice, int toyAmount, int productionTime) {
		this.costPrice = costPrice;
		this.toyAmount = toyAmount;
		this.productionTime = productionTime;
	}
	
	public int getCostPrice() {
		return costPrice;
	}
	
	public void setCostPrice(int costPrice) {
		this.costPrice = costPrice;
	}
	
	public int getToyAmount() {
		return toyAmount;
	}
	
	public void setToyAmount(int toyAmount) {
		this.toyAmount = toyAmount;
	}
	
	public int getProductionTime() {
		return productionTime;
	}
	
	public void setProductionTime(int productionTime) {
		this.productionTime = productionTime;
	}
}
