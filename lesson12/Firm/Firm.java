public class Firm {
	private String startWork = "New firm begins to work";
	
	public String getfirmStatus() {
		return startWork;
	}
	
	public void openNewFirm() {
		System.out.println("A new firm has been opened");
	}
  
	class FirmExtended{
		private int branchesAmount;
		
		public FirmExtended(){
			this.branchesAmount = 0;
		}
		
		public int branchesAmount() {
			return branchesAmount;
		}
		public void extendFirm() {
			System.out.println("A new branch of the company has been opened");
			++branchesAmount;
		}
	}
	static class SalesDepartment{
		private int firmRevenue = 1000000;
		
		public int getfirmRevenue() {
			return firmRevenue;
		}
		
		public void sale() {
			System.out.println("A deal has been made!");
		}
	}
}
