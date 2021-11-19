import java.util.Scanner;

public class SumOfTwo {

	public static void main(String[] args) {
		SumOfTwo sum = new SumOfTwo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int digit1 = sc.nextInt();
		System.out.println("Enter the second number:");
		int digit2 = sc.nextInt();
		sc.close();
		
		System.out.println("Result: " + sum.sumOfTwo(digit1, digit2));
	}

	public int sumOfTwo(int digit1, int digit2) {
		return (digit1 + digit2) + (digit1 * digit2);
	}
}
