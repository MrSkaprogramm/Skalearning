import java.util.Scanner;

public class ATM {
	static Scanner sc = new Scanner(System.in);
	private int value20_banknote;
	private int value50_banknote;
	private int value100_banknote;
	
	public ATM(int value20_banknote, int value50_banknote, int value100_banknote) {
		this.value20_banknote = value20_banknote;
		this.value50_banknote = value50_banknote;
		this.value100_banknote = value100_banknote;
	}
	
	public void setValue20(int value20) {
		this.value20_banknote = value20;
	}
	
	public void setValue50(int value50) {
		this.value50_banknote = value50;
	}
	
	public void setValue100(int value100) {
		this.value100_banknote = value100;
	}
	
	public int getValue20() {
		return value20_banknote;
	}
	
	public int getValue50() {
		return value50_banknote;
	}
	
	public int getValue100() {
		return value100_banknote;
	}

	public static void main(String[] args) {
		ATM atm = new ATM(0, 0, 0);
		
		System.out.println("Hello! What do you want to do?");
		Option(atm);
	}
	
	public static void Option(ATM atm) {
		int option = 0;
		while(option <= 0 ||option >= 4) {
			System.out.println("\n" + "Press 1 to add money" + "\n" + "Press 2 to withdraw money" + "\n" + "Press 3 to exit");
			option = sc.nextInt();
		}
			if(option == 1) {
				AddMoney(atm, option);
			}else if(option == 2) {
				WithdrawMoney(atm, option);
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
			atm.setValue20(atm.getValue20() - withdraw20);
			atm.setValue50(atm.getValue50() - withdraw50);
			atm.setValue100(atm.getValue100() - withdraw100);
			
			System.out.println("Operation completed successfully! What do you want to do next?");
			Option(atm);
		}else if(option == 2) {
			System.out.println("What do you want to do next?");
			Option(atm);
		}
	}
	
	public static void AddMoney(ATM atm, int option) {
		System.out.println("How many 20-value banknotes you want to add?");
		atm.setValue20(sc.nextInt());
		System.out.println("How many 50-value banknotes you want to add?");
		atm.setValue50(sc.nextInt());
		System.out.println("How many 100-value banknotes you want to add?");
		atm.setValue100(sc.nextInt());
		System.out.println("Operation completed successfully! What do you want to do next?");
		Option(atm);
	}

	public static void WithdrawMoney(ATM atm, int option) {
		System.out.println(atm.getValue20());
		System.out.println(atm.getValue50());
		System.out.println(atm.getValue100());
		
		System.out.println("How much do you want to withdraw from your account?");
		int withdrawSum = sc.nextInt();
		int ATMSum = 20*atm.getValue20() + 50*atm.getValue50() + 100*atm.getValue100();
		int withdraw100 = withdrawSum / 100;
		int withdraw50 = 0;
		int withdraw20 = 0;
		
		if(ATMSum == withdrawSum) {
			withdraw100 = atm.getValue100();
			withdraw50 = atm.getValue50();
			withdraw20 = atm.getValue20();
			System.out.println("Do you want to withdraw " + withdrawSum + " with: " + "\n" + withdraw20 + " banknotes of nominal value 20"
								+ "\n" + withdraw50 + " banknotes of nominal value 50" + "\n" + withdraw100 + " banknotes of nominal value 100?");
			withdrawOption(option, atm, withdraw100, withdraw50, withdraw20);
		}else if(ATMSum > withdrawSum) {
			
			if(withdraw100 > 0) {
				withdraw50 = (withdrawSum - withdraw100*100) / 50;
				if(withdraw50 > 0) {
					withdraw20 = (withdrawSum - withdraw100*100 - withdraw50*50) / 20;
					if(withdraw20 > 0) {
						
						withdrawSum = withdraw100*100 + withdraw50*50 + withdraw20*20;
						System.out.println("Do you want to withdraw " + withdrawSum + " with: " + "\n" + withdraw20 + " banknotes of nominal value 20"
											+ "\n" + withdraw50 + " banknotes of nominal value 50" + "\n" + withdraw100 + " banknotes of nominal value 100?");
						withdrawOption(option, atm, withdraw100, withdraw50, withdraw20);
					}else if(withdraw20 == 0) {
						
						withdrawSum = withdraw100*100 + withdraw50*50;
						System.out.println("Do you want to withdraw " + withdrawSum + " with: " 
											+ withdraw50 + " banknotes of nominal value 50" + "\n" + 
												withdraw100 + " banknotes of nominal value 100?");
						withdrawOption(option, atm, withdraw100, withdraw50, withdraw20);
					}
				}else {
					withdraw20 = (withdrawSum - withdraw100*100) / 20;
					if(withdraw20 > 0) {
						
						withdrawSum = withdraw100*100 + withdraw20*20;
						System.out.println("Do you want to withdraw " + withdrawSum + " with: " + "\n" + withdraw20 + " banknotes of nominal value 20"
											+ "\n" + withdraw100 + " banknotes of nominal value 100?");
						withdrawOption(option, atm, withdraw100, withdraw50, withdraw20);
					}else {
						
						withdrawSum = withdraw100*100;
						System.out.println("Do you want to withdraw " + withdrawSum + " with: " + 
									"\n" + withdraw100 + " banknotes of nominal value 100?");
						withdrawOption(option, atm, withdraw100, withdraw50, withdraw20);
					}
				}
			}else {
				withdraw50 = withdrawSum / 50;
				if(withdraw50 > 0) {
					withdraw20 = (withdrawSum - withdraw50*50) / 20;
					if(withdraw20 > 0) {
						
						withdrawSum = withdraw50*50 + withdraw20*20;
						System.out.println("Do you want to withdraw " + withdrawSum + " with: " + "\n" + withdraw20 + " banknotes of nominal value 20"
								+ "\n" + withdraw50 + " banknotes of nominal value 50?");
						withdrawOption(option, atm, withdraw100, withdraw50, withdraw20);
					}else {
						
						withdrawSum = withdraw50*50 + withdraw20*20;
						System.out.println("Do you want to withdraw " + withdrawSum + " with: "
								+ "\n" + withdraw50 + " banknotes of nominal value 50?" + "\n");
						withdrawOption(option, atm, withdraw100, withdraw50, withdraw20);
					}
				}else {
					withdraw20 = (withdrawSum - withdraw50*50) / 20;
					if(withdraw20 > 0) {
						
						withdrawSum = withdraw20*20;
						System.out.println("Do you want to withdraw " + withdrawSum + " with: " + "\n" + withdraw20 + " banknotes of nominal value 20?");
						withdrawOption(option, atm, withdraw100, withdraw50, withdraw20);
					}else {
						
						System.out.println("Unfortunately, the withdrawal of such a small amount is impossible");
						System.out.println("What do you want to do next?");
						Option(atm);
					}
				}
			}
		}else if(ATMSum < withdrawSum) {
			System.out.println("Unfortunately, the withdrawal of such an amount is impossible now");
			System.out.println("What do you want to do next?");
			Option(atm);
		}
	}
}
