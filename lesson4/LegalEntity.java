public class LegalEntity {
	public int taxRate;
	public int yearRevenue;
	
	public LegalEntity(int taxRate) {
		this.taxRate = taxRate;
	}
	
	public void setRevenue(int yearRevenue) {
		this.yearRevenue = yearRevenue;
	}
	
	public double calcClearYearRevenue() {
		return yearRevenue - (yearRevenue/100)*taxRate;
		
	}
	
	public double calcYearTaxValue() {
		return (yearRevenue/100)*taxRate;
		
	}
}
