import java.util.Scanner;

public class SpaceAndNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		long number = sc.nextLong();
		long currentDigit = number ;
		int count = 0;

		while(currentDigit != 0) {
			currentDigit /= 10;
			count++;
		}
		count--;
		int lastDigit = count;
		while(count >= 0) {
			if((count + 1) % 3 == 0 && count != lastDigit) {
				System.out.print(" ");
			}
			currentDigit = (number/(long)(Math.pow(10, count))) % 10;
			System.out.print(currentDigit);
			count--;
		}
	}
}
