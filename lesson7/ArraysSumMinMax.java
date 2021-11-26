public class ArraysSumMinMax {
	public static void main(String[] args) {
		int[] array = new int[10];
		int minElementFirstIndex = 0;
		int minElementLastIndex = 0;
		int countMin = 0;
		int maxElementFirstIndex = 0;
		int maxElementLastIndex = 0;
		int countMax = 0;
		int sum = 0;

		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 10);
			System.out.print(array[i]);
		}
		System.out.println();
		
		int minElement = array[0];
		for(int i = 0; i < array.length; i++) {
			if(array[i] < minElement) {
				minElement = array[i];
				minElementFirstIndex = i;
				if(countMin == 0) {
					countMin = 1;
				}else if(countMin > 0 && minElement < array[0]) {
					countMin = 1;
				} 
			}else if(array[i] == minElement && countMin >= 1) {
				minElementLastIndex = i;
				countMin++;
			}
		}
	
		int maxElement = array[0];
		for(int i = 0; i < array.length; i++) {
			if(array[i] > maxElement) {
				maxElement = array[i];
				maxElementFirstIndex = i;
				if(countMax == 0) {
					countMax = 1;
				}else if(countMax > 0 && maxElement > array[0]) {
					countMax = 1;
				} 
			}else if(array[i] == maxElement && countMax >= 1) {
				maxElementLastIndex = i;
				countMax++;
			}
		}

		if(countMin > 1 && countMax > 1) { 
			if(minElementFirstIndex < maxElementFirstIndex && minElementLastIndex <= maxElementLastIndex) {
				System.out.println("Maximal difference between the indexes of minimum and maximum values: " + (maxElementLastIndex - minElementFirstIndex));
			}else if(maxElementFirstIndex < minElementFirstIndex && maxElementLastIndex <= minElementLastIndex) {
				System.out.println("Maximal difference between the indexes of minimum and maximum values: " + (minElementLastIndex - maxElementFirstIndex));
			}else if(minElementFirstIndex < maxElementFirstIndex && minElementLastIndex > maxElementLastIndex) {
				if((maxElementLastIndex - minElementFirstIndex) > (minElementLastIndex - maxElementFirstIndex)) {
					System.out.println("Maximal difference between the indexes of minimum and maximum values: " + (maxElementLastIndex - minElementFirstIndex));
				}else {
					System.out.println("Maximal difference between the indexes of minimum and maximum values: " + (minElementLastIndex - maxElementFirstIndex));
				}
			}else if(maxElementFirstIndex < minElementFirstIndex && maxElementLastIndex > minElementLastIndex) {
				if((minElementLastIndex - maxElementFirstIndex) > (maxElementLastIndex - minElementFirstIndex)) {
					System.out.println("Maximal difference between the indexes of minimum and maximum values: " + (minElementLastIndex - maxElementFirstIndex));
				}else {
					System.out.println("Maximal difference between the indexes of minimum and maximum values: " + (maxElementLastIndex - minElementFirstIndex));
				}
			}
		}else if(minElementFirstIndex < maxElementFirstIndex) {
			for(int i = minElementFirstIndex +1; i < maxElementFirstIndex; i++) {
				sum += array[i];
			}
			System.out.println("The sum of the array elements located between the minimum and maximum values equals " + sum);
		}else if(minElementFirstIndex > maxElementFirstIndex) {
			for(int i = maxElementFirstIndex +1; i < minElementFirstIndex; i++) {
				sum += array[i];
			}
			System.out.println("The sum of the array elements located between the minimum and maximum values equals " + sum);
		}
	}
}
