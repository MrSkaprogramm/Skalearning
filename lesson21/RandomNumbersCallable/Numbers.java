import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class Numbers implements Callable<String> {
	private static final int MILLIS_IN_SEC = 1000;

	@Override
	public String call() throws Exception {
		List<Integer> numbers = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			numbers.add((int)(Math.random()*10));
		}
		
		Thread.sleep((int)(Math.random()*MILLIS_IN_SEC)*10);
		
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		return String.valueOf(sum) + " calculated by " + Thread.currentThread().getName();
	}
}
