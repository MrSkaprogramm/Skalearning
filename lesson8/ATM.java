import java.util.Scanner;

public class ATM {
	static Scanner sc = new Scanner(System.in);
	private static final int value20_banknote = 20;
	private static final int value50_banknote = 50;
	private static final int value100_banknote = 100;
	private int amount20_banknote;
	private int amount50_banknote;
	private int amount100_banknote;
	
	public ATM(int value20_banknote, int value50_banknote, int value100_banknote) {
		this.amount20_banknote = value20_banknote;
		this.amount50_banknote = value50_banknote;
		this.amount100_banknote = value100_banknote;
	}
	
	public void setAmount20(int set20_banknote) {
		this.amount20_banknote = set20_banknote + amount20_banknote;
	}
	
	public void setAmount50(int set50_banknote) {
		this.amount50_banknote = set50_banknote + amount50_banknote;
	}
	
	public void setAmount100(int set100_banknote) {
		this.amount100_banknote = set100_banknote + amount100_banknote;
	}
	
	public int getAmount20() {
		return amount20_banknote;
	}
	
	public int getAmount50() {
		return amount50_banknote;
	}
	
	public int getAmount100() {
		return amount100_banknote;
	}

	public static void main(String[] args) {
		ATM atm = new ATM(0, 0, 0);
		
		System.out.println("Hello! What do you want to do?");
		option(atm);
	}
	
	public static void option(ATM atm) {
		int option = 0;
		while(option <= 0 ||option >= 4) {
			System.out.println("\n" + "Press 1 to add money" + "\n" + "Press 2 to withdraw money" + "\n" + "Press 3 to exit");
			option = sc.nextInt();
		}
			if(option == 1) {
				addMoney(atm, option);
			}else if(option == 2) {
				withdrawMoney(atm, option);
			}else {
				System.out.print("Have a nice day!");
				sc.close();
				return;
			}
	}
	
	public static void withdrawOption(int option, ATM atm, int withdraw100, int withdraw50, int withdraw20) {
		option = 0;
		while(option <= 0 ||option >= 3) {
			System.out.println("\n" + "1 - YES" + "\n" + "2 - NO");
			option = sc.nextInt();
		}
		if(option == 1) {
			atm.setAmount20(atm.getAmount20() - withdraw20);
			atm.setAmount50(atm.getAmount50() - withdraw50);
			atm.setAmount100(atm.getAmount100() - withdraw100);
			
			System.out.println("Operation completed successfully! What do you want to do next?");
			option(atm);
		}else if(option == 2) {
			System.out.println("What do you want to do next?");
			option(atm);
		}
	}
	
	public static void addMoney(ATM atm, int option) {
		System.out.println("How many 20-value banknotes you want to add?");
		atm.setAmount20(sc.nextInt());
		System.out.println("How many 50-value banknotes you want to add?");
		atm.setAmount50(sc.nextInt());
		System.out.println("How many 100-value banknotes you want to add?");
		atm.setAmount100(sc.nextInt());
		System.out.println("Operation completed successfully! What do you want to do next?");
		option(atm);
	}

	public static void withdrawMoney(ATM atm, int option) {
		
		System.out.println("How much do you want to withdraw from your account?");
		int withdrawSum = sc.nextInt();
		int atmSum = value20_banknote*atm.getAmount20() + value50_banknote*atm.getAmount50() + value100_banknote*atm.getAmount100();
		int withdraw100 = withdrawSum / value100_banknote;
		int withdraw50 = 0;
		int withdraw20 = 0;
		
		if(atmSum == withdrawSum) {
			withdraw100 = atm.getAmount100();
			withdraw50 = atm.getAmount50();
			withdraw20 = atm.getAmount20();
			System.out.println("Do you want to withdraw " + withdrawSum + " with: " + "\n" + withdraw20 + " banknotes of nominal value 20"
								+ "\n" + withdraw50 + " banknotes of nominal value 50" + "\n" + withdraw100 + " banknotes of nominal value 100?");
			withdrawOption(option, atm, withdraw100, withdraw50, withdraw20);
		}else if(atmSum > withdrawSum) {
			
			if(withdraw100 > 0) {
				withdraw50 = (withdrawSum - withdraw100*value100_banknote) / value50_banknote;
				if(withdraw50 > 0) {
					withdraw20 = (withdrawSum - withdraw100*value100_banknote - withdraw50*50) / value20_banknote;
					if(withdraw20 > 0) {
						
						withdrawSum = withdraw100*value100_banknote + withdraw50*value50_banknote + withdraw20*value20_banknote;
						System.out.println("Do you want to withdraw " + withdrawSum + " with: " + "\n" + withdraw20 + " banknotes of nominal value 20"
											+ "\n" + withdraw50 + " banknotes of nominal value 50" + "\n" + withdraw100 + " banknotes of nominal value 100?");
						withdrawOption(option, atm, withdraw100, withdraw50, withdraw20);
					}else if(withdraw20 == 0) {
						
						withdrawSum = withdraw100*value100_banknote + withdraw50*value50_banknote;
						System.out.println("Do you want to withdraw " + withdrawSum + " with: " 
											+ withdraw50 + " banknotes of nominal value 50" + "\n" + 
												withdraw100 + " banknotes of nominal value 100?");
						withdrawOption(option, atm, withdraw100, withdraw50, withdraw20);
					}
				}else {
					withdraw20 = (withdrawSum - withdraw100*value100_banknote) / value20_banknote;
					if(withdraw20 > 0) {
						
						withdrawSum = withdraw100*value100_banknote + withdraw20*value20_banknote;
						System.out.println("Do you want to withdraw " + withdrawSum + " with: " + "\n" + withdraw20 + " banknotes of nominal value 20"
											+ "\n" + withdraw100 + " banknotes of nominal value 100?");
						withdrawOption(option, atm, withdraw100, withdraw50, withdraw20);
					}else {
						
						withdrawSum = withdraw100*value100_banknote;
						System.out.println("Do you want to withdraw " + withdrawSum + " with: " + 
									"\n" + withdraw100 + " banknotes of nominal value 100?");
						withdrawOption(option, atm, withdraw100, withdraw50, withdraw20);
					}
				}
			}else {
				withdraw50 = withdrawSum / value50_banknote;
				if(withdraw50 > 0) {
					withdraw20 = (withdrawSum - withdraw50*value50_banknote) / value20_banknote;
					if(withdraw20 > 0) {
						
						withdrawSum = withdraw50*value50_banknote + withdraw20*value20_banknote;
						System.out.println("Do you want to withdraw " + withdrawSum + " with: " + "\n" + withdraw20 + " banknotes of nominal value 20"
								+ "\n" + withdraw50 + " banknotes of nominal value 50?");
						withdrawOption(option, atm, withdraw100, withdraw50, withdraw20);
					}else {
						
						withdrawSum = withdraw50*value50_banknote + withdraw20*value20_banknote;
						System.out.println("Do you want to withdraw " + withdrawSum + " with: "
								+ "\n" + withdraw50 + " banknotes of nominal value 50?" + "\n");
						withdrawOption(option, atm, withdraw100, withdraw50, withdraw20);
					}
				}else {
					withdraw20 = (withdrawSum - withdraw50*value50_banknote) / value20_banknote;
					if(withdraw20 > 0) {
						
						withdrawSum = withdraw20*value20_banknote;
						System.out.println("Do you want to withdraw " + withdrawSum + " with: " + "\n" + withdraw20 + " banknotes of nominal value 20?");
						withdrawOption(option, atm, withdraw100, withdraw50, withdraw20);
					}else {
						
						System.out.println("Unfortunately, the withdrawal of such a small amount is impossible");
						System.out.println("What do you want to do next?");
						option(atm);
					}
				}
			}
		}else if(atmSum < withdrawSum) {
			System.out.println("Unfortunately, the withdrawal of such an amount is impossible now");
			System.out.println("What do you want to do next?");
			option(atm);
		}
	}
}
