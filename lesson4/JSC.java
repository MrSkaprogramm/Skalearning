public class JSC extends LegalEntity {
	public int roadTax;
	
	public JSC(int taxRate, int roadTax) {
		super(taxRate);
		this.roadTax = roadTax;
	}
	
	@Override
	public double calcClearYearRevenue() {
		return yearRevenue - (yearRevenue/100)*taxRate - (yearRevenue/100)*roadTax;
		
	}
	
	@Override
	public double calcYearTaxValue() {
		return (yearRevenue/100)*taxRate + (yearRevenue/100)*roadTax;
		
	}
}
