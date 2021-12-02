public class GeneralManager extends Managers {
	
	public GeneralManager(int hours, int companyRevenue, int bonus, int percentRevenueRate) {
		super(hours, companyRevenue, bonus, percentRevenueRate);
	}
	
	@Override
	public int calculateSalary() {
		int Salary = (getCompanyRevenue()/100)*getPercentRevenueRate();
		return Salary;
	}
}
