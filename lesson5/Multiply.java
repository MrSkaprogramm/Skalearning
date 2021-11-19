public class Multiply {

	public static void main(String[] args) {
		int currentDigit = 1;
		double result = 1;
		
		do {
			result *= currentDigit;
			currentDigit++;
		}while(currentDigit <= 25);
		System.out.println("Multiply of digits from 1 to 25 is: " + result);
	}
}
