import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAllPunctuation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		char symbol;
		System.out.println("Enter string:");
		String findThere = sc.nextLine();
		sc.close();
		Pattern p = Pattern.compile("[\"\\!',;:.?-]");
		Matcher m = p.matcher(findThere);
		
		for(int i = 0; i < findThere.length(); i++) {
			symbol = findThere.charAt(i);
			if(m.find()) {
				count++;
			}
		}
		System.out.println("Amount of punctuation marks is: " + count);
	}
}
