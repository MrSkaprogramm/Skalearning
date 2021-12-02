public class Managers extends FactoryEmployee {
	private int hours;
	private int companyRevenue;
	private int percentRevenueRate;
	private int hourlyRate;
	private int bonus;
	
	public Managers(int hours, int companyRevenue, int bonus, int percentRevenueRate) {
		this.hours = hours;
		this.companyRevenue = companyRevenue;
		this.bonus = bonus;
		this.percentRevenueRate = percentRevenueRate;
	}
	
	public int getHours(int hours) {
		return hours;
	}
	
	public int getCompanyRevenue() {
		return companyRevenue;
	}
	
	public int getBonus() {
		return bonus;
	}
	
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate =  hourlyRate;
	}
	
	public int getHourlyRate() {
		return hourlyRate;
	}
	
	public int getPercentRevenueRate() {
		return percentRevenueRate;
	}
	
	public int calculateSalary() {
		int Salary = hours*hourlyRate + ((hours*hourlyRate)/100)*bonus;
		return Salary;
	}
}
