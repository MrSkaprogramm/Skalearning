import java.util.ArrayList;
import java.util.List;

public class Random {
	private static final int AmountElements = 16;

	public static void main(String[] args) {
		List<Integer> randomCollection = new ArrayList<>();
		
		for(int i = 0; i < AmountElements; i++) {
			randomCollection.add((int)(Math.random()*10 + 1));
		}
		System.out.println("All random numbers:");
		for(int i = 0; i < randomCollection.size(); i++) {
				System.out.print(randomCollection.get(i) + " ");
		}
		
		for(int i = 0; i < randomCollection.size(); i++) {
			for(int j = i + 1; j < randomCollection.size(); j++) {
				if(randomCollection.get(i).equals(randomCollection.get(j))) {
					randomCollection.remove(j);
					j--;
				}
			}
		}
		
		System.out.println("\n" + "All random numbers without repeating:");
		for(int i = 0; i < randomCollection.size(); i++) {
				System.out.print(randomCollection.get(i) + " ");
		}
	}
}
