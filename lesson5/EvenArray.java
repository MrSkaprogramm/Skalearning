public class EvenArray {

	public static void main(String[] args) {
		EvenArray evenArray = new  EvenArray();
		
		System.out.println("Even position digits: " + evenArray.defineEvenPositionNumbers());
	}

	public String defineEvenPositionNumbers() {
		int[] array = new int[10];
		StringBuilder digits = new StringBuilder();
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
		}
		for(int i = 0; i < array.length; i++) {
			if((i+1) % 2 == 0) {
				digits.append(array[i]);
				digits.append("; ");
			}
		}
		String evenDigits = digits.toString();
		return evenDigits;
	}

}
