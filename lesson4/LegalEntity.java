public class LegalEntity {
	private int taxRate;
	private int yearRevenue;
	
	public LegalEntity(int taxRate) {
		this.taxRate = taxRate;
	}
	
	public void setRevenue(int yearRevenue) {
		this.yearRevenue = yearRevenue;
	}
	
	public int getYearRevenue() {
		return yearRevenue;
	}
	
	public int getTaxRate() {
		return taxRate;
	}
	
	public double calcClearYearRevenue() {
		return yearRevenue - (yearRevenue/100)*taxRate;	
	}
	
	public double calcYearTaxValue() {
		return (yearRevenue/100)*taxRate;
	}
}
