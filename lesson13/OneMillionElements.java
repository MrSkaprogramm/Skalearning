import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class OneMillionElements {
	private double time;
	private double arrayTime;
	private double linkTime;
	private static final int AMOUNT_ELEMENTS = 1000000;
	private static final int CHOOSE_COUNT = 100000;
	private static final double MILLIS_TO_SEC  = 1000.0;
	
	public void setTime(double time) {
		this.time = time;
	}
	
	public void setArrayTime(double arrayTime) {
		this.arrayTime = arrayTime;
	}
	
	public void setLinkTime(double linkTime) {
		this.linkTime = linkTime;
	}
	
	public double getTime() {
		return time;
	}
	
	public double getArrayTime() {
		return arrayTime;
	}
	
	public double getLinkTime() {
		return linkTime;
	}

	public static void main(String[] args) {
		OneMillionElements random = new OneMillionElements();
		random.getRandom(random.addMillionArray(), random.addMillionLink());
	}
	
	public List<Integer> addMillionArray() {
		List<Integer> millionArray = new ArrayList<>();
		
		setTime(System.currentTimeMillis()/MILLIS_TO_SEC);
		for(int i = 0; i < AMOUNT_ELEMENTS; i++) {
			millionArray.add((int)(Math.random()*10 + 1));
		}
		setArrayTime(arrayTime = System.currentTimeMillis()/MILLIS_TO_SEC - time);
		System.out.println("To add items to ArrayList estimated time is: " + getArrayTime() + " seconds");
		addInMiddleMillionArray(millionArray);
		
		return millionArray;
	}
	
	public void addInMiddleMillionArray(List<Integer> millionArray) {
		millionArray.clear();
		
		setTime(System.currentTimeMillis()/MILLIS_TO_SEC);
		for(int i = 0; i < AMOUNT_ELEMENTS; i++) {
			millionArray.add((millionArray.size()/2), (int)(Math.random()*10 + 1));;
		}
		setArrayTime(arrayTime = System.currentTimeMillis()/MILLIS_TO_SEC - time);
		System.out.println("To add items to middle of ArrayList estimated time is: " + getArrayTime() + " seconds");
	}
	
	public List<Integer> addMillionLink() {
		List<Integer> millionLink = new LinkedList<>();
		
		setTime(System.currentTimeMillis()/MILLIS_TO_SEC);
		for(int i = 0; i < AMOUNT_ELEMENTS; i++) {
			millionLink.add((int)(Math.random()*10 + 1));
		}
		
		setLinkTime(System.currentTimeMillis()/MILLIS_TO_SEC - time);
		System.out.println("To add items to LinkedList estimated time is: " + getLinkTime() + " seconds");
		addInMiddleMillionLink(millionLink);
		
		return millionLink;
	}
	
	public void addInMiddleMillionLink(List<Integer> millionLink) {
		millionLink.clear();
		
		setTime(System.currentTimeMillis()/MILLIS_TO_SEC);
		for(int i = 0; i < AMOUNT_ELEMENTS; i++) {
			if(i >= 2) {
				millionLink.add((millionLink.size()/2), (int)(Math.random()*10 + 1));
			}else {
				millionLink.add((int)(Math.random()*10 + 1));
			}
		}
		setLinkTime(System.currentTimeMillis()/MILLIS_TO_SEC - time);
		System.out.println("To add items to middle of LinkedList estimated time is: " + getLinkTime() + " seconds");
	}
	
	public void getRandom(List<Integer> millionArray, List<Integer> millionLink) {
		
		setTime(System.currentTimeMillis()/MILLIS_TO_SEC);
		for(int i = 0; i < CHOOSE_COUNT; i++) {
			millionArray.get(((int)(Math.random()*CHOOSE_COUNT)));
		}
		setArrayTime(System.currentTimeMillis()/MILLIS_TO_SEC - time);
		System.out.println("To choose items from ArrayList estimated time is: " + getArrayTime() + " seconds");
		
		setTime(System.currentTimeMillis()/MILLIS_TO_SEC);
		for(int i = 0; i < CHOOSE_COUNT; i++) {
			millionLink.get(((int)(Math.random()*CHOOSE_COUNT)));
		}
		setLinkTime(System.currentTimeMillis()/MILLIS_TO_SEC - time);
		System.out.println("To choose items from LinkedList estimated time is: " + getLinkTime() + " seconds");
	}
}
