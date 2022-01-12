import java.util.stream.Stream;

public class Length {
	private static final int MAX_VALUE = 20;
	private static final double LENGTH_DIFFERENCE = 2.54;

	public static void main(String[] args) {
		Stream.of(getRandomNum(), getRandomNum(), getRandomNum(), getRandomNum(), getRandomNum(), getRandomNum(), getRandomNum(), getRandomNum())
		.filter(length -> length % 2 == 0)
		.peek(length -> System.out.print("Length in inches: " + length))
		.map(length -> length*LENGTH_DIFFERENCE)
		.forEach(length -> System.out.println(" | Length in centimeters: " + length));
	}
	
	public static int getRandomNum() {
		return (int)(Math.random()*MAX_VALUE);
	}
}
