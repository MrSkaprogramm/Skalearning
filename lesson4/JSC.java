public class JSC extends LegalEntity {
	public int roadTax;
	
	public JSC(int taxRate, int roadTax) {
		super(taxRate);
		this.roadTax = roadTax;
	}
	
	@Override
	public double calcClearYearRevenue() {
		return super.getYearRevenue() - (super.getYearRevenue()/100)*getTaxRate() - (super.getYearRevenue()/100)*roadTax;
		
	}
	
	@Override
	public double calcYearTaxValue() {
		return (super.getYearRevenue()/100)*getTaxRate() + (super.getYearRevenue()/100)*roadTax;
		
	}
}
