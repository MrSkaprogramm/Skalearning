import java.util.Scanner;

public class DefineLastDigit7 {

	public static void main(String[] args) {
		DefineLastDigit7 defineDigit = new DefineLastDigit7();
		Scanner sc = new Scanner(System.in);
		int digit = 0;
		System.out.println("Enter the number:");
		digit = sc.nextInt();
		
		System.out.println("Is your digit's last gigit equals '7': " + defineDigit.defineLastDigit(digit));
	}

	public boolean defineLastDigit(int digit) {
		int lastDigit = (int)Math.abs(digit % 10);
		if(lastDigit == 7) {
			return true;
		}else {
			return false;
		}
	}
}
