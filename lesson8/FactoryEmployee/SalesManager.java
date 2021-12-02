public class SalesManager extends OfficeWorker {
	public int percentSalesRate;
	public int salesRevenue;
	
	public SalesManager(int bonus, int percentSalesRate, int salesRevenue, int hours) {
		super(bonus, hours);
		this.percentSalesRate = percentSalesRate;
		this.salesRevenue = salesRevenue;
	}

	@Override
	public int calculateSalary() {
		int Salary = (salesRevenue / 100) *percentSalesRate;
		return Salary;
	}
}
