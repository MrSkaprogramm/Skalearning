import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class DefineDivisionBy3And5 {
	private int n = (int)(Math.random()*100 + 10);
	private int minValue = (int)(Math.random()*100);
	private int maxValue = minValue + (int)(Math.random()*100 + 10);
	
	public static void main(String[] args) {
		DefineDivisionBy3And5 defineNumbers = new DefineDivisionBy3And5();
		
		defineNumbers.createList();
	}
	
	public void createList() {
		System.out.println("All numbers:");
		List<Integer> numbers = new Random().ints(n, minValue, maxValue)
				.boxed()
				.collect(Collectors.toList());
		System.out.println(numbers);
		
		defineDivisionNumbers(numbers);
	}
	
	public void defineDivisionNumbers(List<Integer> numbers) {
		System.out.println("Numbers, that divides by 3 and 5:");
		numbers.stream()
			.filter(number -> number % 3 == 0 && number % 5 == 0)
			.forEach(number -> System.out.print(number + " "));
	}
}
