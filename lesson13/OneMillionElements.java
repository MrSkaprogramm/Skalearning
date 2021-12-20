import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class OneMillionElements {

	public static void main(String[] args) {
		OneMillionElements random = new OneMillionElements();
		random.getRandom(random.addMillionArray(), random.addMillionLink());
	}
	
	public List<Integer> addMillionArray() {
		List<Integer> millionArray = new ArrayList<>();
		
		for(int i = 0; i < 1000000; i++) {
			millionArray.add((int)(Math.random()*10 + 1));
		}
		
		return millionArray;
	}
	
	public List<Integer> addMillionLink() {
		List<Integer> millionLink = new LinkedList<>();
		
		for(int i = 0; i < 1000000; i++) {
			millionLink.add((int)(Math.random()*10 + 1));
		}
		return millionLink;
	}
	
	public void getRandom(List<Integer> millionArray, List<Integer> millionLink) {
		long time;
		long arrayTime;
		long linkTime;
		
		time = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			millionArray.get(((int)(Math.random()*10 + 1)) * 10000 - 1);
		}
		arrayTime = System.currentTimeMillis() - time;
		System.out.println("To choose an item from ArrayList estimated time is: " + arrayTime + " milliseconds");
		
		time = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			millionLink.get(((int)(Math.random()*10 + 1)) * 10000 - 1);
		}
		linkTime = System.currentTimeMillis() - time;
		System.out.println("To choose an item from LinkedList estimated time is: " + linkTime + " milliseconds");
	}
}
