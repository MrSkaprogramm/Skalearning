public class GeneralManager {

	public static void main(String[] args) {
		Firm firm = new Firm();
		firm.openNewFirm();
		System.out.println("Now firm status is: " + firm.getfirmStatus());
		
		Firm.FirmExtended firmExtended = firm.new FirmExtended();
		firmExtended.extendFirm();
		System.out.println("Now amount of brances is : " + firmExtended.branchesAmount());
		firmExtended.extendFirm();
		System.out.println("Now amount of brances is: " + firmExtended.branchesAmount());
		
		Firm.SalesDepartment salesDepartment = new Firm.SalesDepartment();
		salesDepartment.sale();
		System.out.println("Now firm revenue is: " + salesDepartment.getfirmRevenue() + "$");
	}
}
