public class JSC extends LegalEntity {
	public int roadTax;
	
	public JSC(int taxRate, int roadTax) {
		super(taxRate);
		this.roadTax = roadTax;
	}
	
	@Override
	public double calcClearYearRevenue() {
		double clearYearRevenue;
		clearYearRevenue = yearRevenue - (yearRevenue/100)*taxRate - (yearRevenue/100)*roadTax;
		return clearYearRevenue;
		
	}
	
	@Override
	public double calcYearTaxValue() {
		double yearTaxValue = 0;
		yearTaxValue = (yearRevenue/100)*taxRate + (yearRevenue/100)*roadTax;
		return yearTaxValue;
		
	}
}
