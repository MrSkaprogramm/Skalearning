import java.util.Scanner;

public class MoneyChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount of money in rubles: ");
		int money = sc.nextInt();
		sc.close();
		
		System.out.println("Your amount of money is: ");
		switch(money % 10) {
			case 1:
				if(money > 10 && money < 20) {
					System.out.println(money + " рублей");
				}else {
					System.out.println(money + " рубль");
				}
				break;
			case 2, 3, 4:
				if(money > 10 && money < 20) {
					System.out.println(money + " рублей");
				}else {
					System.out.println(money + " рубля");
				}
				break;
			default:
				System.out.println(money + " рублей");
		}
	}
}
