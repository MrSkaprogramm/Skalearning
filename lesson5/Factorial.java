public class Factorial {

	public static void main(String[] args) {
		int currentDigit = 1;
		int result = 1;
		
		while(currentDigit <= 10 ) {
			result *= currentDigit;
			currentDigit++;
		}
		System.out.println("Factorial of digits from 0 to 10 is: " + result);
	}
}
