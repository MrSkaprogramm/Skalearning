public class SumDigits {

	public static void main(String[] args) {
		long totalDigits = 7893823445L;
		long digit = 7893823445L;
		int count = 0;
		long sumDigits = 0;
		
		while(totalDigits != 0) {
			totalDigits /= 10;
			count ++;
		}
		 do {
			--count;
			sumDigits += (digit / (long)Math.pow(10, count)) % 10;
		} while(count > 0);
		
		System.out.println("Sum of digits in number 7893823445 equals: " + sumDigits);
	}
}
