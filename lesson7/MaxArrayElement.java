public class MaxArrayElement {

	public static void main(String[] args) {
		int[] array = new int[10];
		int maxElement = 0;
		int maxElementIndex = 0;
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*10);
			if(maxElement < array[i]) {
				maxElement = array[i];
				maxElementIndex = i;
			}
		}
		System.out.println("Index of maximal array element is: " + maxElementIndex);
	}
}
