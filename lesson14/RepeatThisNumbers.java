import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatThisNumbers {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the line with numbers:");
		String text = sc.nextLine();
		sc.close();
		List<Integer> strings = new ArrayList<>();
		RepeatThisNumbers deleteNumbers = new RepeatThisNumbers();
		deleteNumbers.findNumbersInText(text, strings);
	}
		
	public void findNumbersInText(String text, List<Integer> strings) {
		int count = 0;
		for(int i = 0; i < text.length(); i++) {
			if(Character.toString(text.charAt(i)).matches("[0-9]")) {
				strings.add(count, Integer.parseInt(text.substring(i, i + 1)));
				count++;
			}
		}
		deleteRepeatingNumbers(strings);
	}
		
	public void deleteRepeatingNumbers(List<Integer> strings) {
		int currentNum;
			
		for(int i = 0; i < strings.size(); i++) {
			currentNum = strings.get(i);
			for(int j = i + 1; j < strings.size(); j++) {
				if(currentNum == strings.get(j)) {
					strings.remove(j);
					j--;
				}
			}
		}
		printNumbers(strings);
	}
		
	public void printNumbers(List<Integer> strings) {	
		System.out.println("Line without all repeating numbers:");
		for(int i = 0; i < strings.size(); i++) {
			System.out.print(strings.get(i) + " ");
		}
	}
}
