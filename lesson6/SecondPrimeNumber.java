public class SecondPrimeNumber {

	public static void main(String[] args) {
		int secondPrime = 0;
		boolean count = false;
		
		for(int i = 50; i <= 70; i++) {
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					break;
				}
				if(i % j != 0 && j == i - 1) {
					if(count == true) {
						secondPrime = i;
						break;
					}
					count = true;
				}
			}
			if(secondPrime == i) {
				System.out.println("Second prime number is: " + secondPrime);
				break;
			}else if(secondPrime == 0 && i == 70) {
				System.out.println("There is no second prime number");
			}
		}
	}
}
