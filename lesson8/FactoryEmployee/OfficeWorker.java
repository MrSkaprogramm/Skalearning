public class OfficeWorker extends Worksers {
	private int hourlyRate;
	private int hours;
	
	public OfficeWorker(int bonus, int hours) {
		super(bonus);
		this.hours = hours;
	}
	
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	public int getHourlyRate() {
		return hourlyRate;
	}
	
	public int getHours() {
		return hours;
	}
	
	public int calculateSalary() {
		int Salary = hours * hourlyRate + ((hours*hourlyRate)/100)*getBonus();
		return Salary;
	}
}
