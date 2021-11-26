public class ArrayReverse {

	public static void main(String[] args) {
		int[] array = new int[10];
		
		System.out.println("Your standart array:");
		for(int i = 0; i< array.length; i++) {
			array[i] = (int)(Math.random()*10);
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("Your reversed array:");
		for(int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}
}
