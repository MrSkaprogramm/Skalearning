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
		double clearYearRevenue;
		clearYearRevenue = yearRevenue - (yearRevenue/100)*taxRate;
		return clearYearRevenue;
		
	}
	
	public double calcYearTaxValue() {
		double yearTaxValue;
		yearTaxValue = (yearRevenue/100)*taxRate;
		return yearTaxValue;
		
	}
}
