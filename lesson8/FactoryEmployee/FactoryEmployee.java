import java.util.Scanner;

public class FactoryEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bonus = Integer.MIN_VALUE;
		int accountantHourlyRate = Integer.MIN_VALUE;
		int collectorHourlyRate = Integer.MIN_VALUE;
		int engineerHourlyRate = Integer.MIN_VALUE;
		int headOfProductSalesHourlyRate = Integer.MIN_VALUE;
		int maintenanceWorkerHourlyRate = Integer.MIN_VALUE;
		int mechanicHourlyRate = Integer.MIN_VALUE;
		int productionManagerHourlyRate = Integer.MIN_VALUE;
		int percentSalesRate = Integer.MIN_VALUE;
		int salesRevenue = Integer.MIN_VALUE;
		int companyRevenue = Integer.MIN_VALUE ;
		int percentRevenueRate = Integer.MIN_VALUE;
		int hours = Integer.MIN_VALUE;
		
		System.out.println("Enter bonus percent value:");
		bonus = sc.nextInt();
		System.out.println("Enter accountant hourly rate value:");
		accountantHourlyRate = sc.nextInt();
		System.out.println("Enter collector hourly rate value:");
		collectorHourlyRate = sc.nextInt();
		System.out.println("Enter engineer hourly rate value:");
		engineerHourlyRate = sc.nextInt();
		System.out.println("Enter head of product sales hourly rate value:");
		headOfProductSalesHourlyRate = sc.nextInt();
		System.out.println("Enter maintenance worker hourly rate value:");
		maintenanceWorkerHourlyRate = sc.nextInt();
		System.out.println("Enter mechanic hourly rate value:");
		mechanicHourlyRate = sc.nextInt();
		System.out.println("Enter production manager hourly rate value:");
		productionManagerHourlyRate = sc.nextInt();
		System.out.println("Enter percent of sales rate value for  sales manager:");
		percentSalesRate = sc.nextInt();
		System.out.println("Enter sales revenue value:");
		salesRevenue = sc.nextInt();
		System.out.println("Enter company revenue value:");
		companyRevenue = sc.nextInt();
		System.out.println("Enter the value of the interest rate from the income for general manager");
		percentRevenueRate = sc.nextInt();
		System.out.println("Enter the number of working hours per month:");
		hours = sc.nextInt();
		sc.close();
		
		FactoryEmployee factoryemployee = new FactoryEmployee();
		Accountant accountant = new Accountant(bonus, hours);
		Engineer engineer = new Engineer(bonus, hours);
		SalesManager salesmanager = new SalesManager(bonus, percentSalesRate, salesRevenue, hours);
		Collector collector = new Collector(bonus, hours);
		MaintenanceWorker maintenanceworker = new MaintenanceWorker(bonus, hours);
		Mechanic mechanic = new Mechanic(bonus, hours);
		GeneralManager generalmanager = new GeneralManager(hours, companyRevenue, bonus, percentRevenueRate);
		HeadOfProductSales headofproductsales = new HeadOfProductSales(hours, companyRevenue, bonus, percentRevenueRate);
		ProductionManager productionmanager = new ProductionManager(hours, companyRevenue, bonus, percentRevenueRate);
		accountant.setHourlyRate(accountantHourlyRate);
		engineer.setHourlyRate(engineerHourlyRate);
		collector.setHourlyRate(collectorHourlyRate);
		maintenanceworker.setHourlyRate(maintenanceWorkerHourlyRate);
		mechanic.setHourlyRate(mechanicHourlyRate);
		headofproductsales.setHourlyRate(headOfProductSalesHourlyRate);
		productionmanager.setHourlyRate(productionManagerHourlyRate);
		
		factoryemployee.factoryOfficeEmployeeSalary(accountant, engineer, salesmanager);
		factoryemployee.factoryShopWorkersEmployeeSalary(collector, maintenanceworker, mechanic);
		factoryemployee.factoryManagersEmployeeSalary(generalmanager, headofproductsales, productionmanager);
		
	}

	public void factoryOfficeEmployeeSalary(Accountant accountant, Engineer engineer, SalesManager salesmanager) {
		System.out.println("Accountant mouthly salary: " + accountant.calculateSalary());
		System.out.println("Engineer mouthly salary: " + engineer.calculateSalary());
		System.out.println("Sales manager mouthly salary: " + salesmanager.calculateSalary());
	}

	public void factoryShopWorkersEmployeeSalary(Collector collector, MaintenanceWorker maintenanceworker, Mechanic mechanic) {
		System.out.println("Collector mouthly salary: " + collector.calculateSalary());
		System.out.println("Maintenance worker mouthly salary: " + maintenanceworker.calculateSalary());
		System.out.println("Mechanic mouthly salary: " + mechanic.calculateSalary());
	}
	public void factoryManagersEmployeeSalary(GeneralManager generalmanager, HeadOfProductSales headofproductsales, ProductionManager productionmanager) {
		System.out.println("General manager mouthly salary: " + generalmanager.calculateSalary());
		System.out.println("Head of product sales mouthly salary: " + headofproductsales.calculateSalary());
		System.out.println("Production manager mouthly salary: " + productionmanager.calculateSalary());
	}
}
