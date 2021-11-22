public class SumDigits {

	public static void main(String[] args) {
		long digit = 7893823445L;
		long sumDigits = 0;
		
		 do {
			 sumDigits += (digit % 10);
			 digit /= 10;
		} while(digit != 0);
		
		System.out.println("Sum of digits in number 7893823445 equals: " + sumDigits);
	}
}
