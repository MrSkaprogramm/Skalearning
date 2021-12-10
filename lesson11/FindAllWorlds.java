import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAllWorlds {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text:");
		String text = sc.nextLine();
		sc.close();
		int count = 0;

		text = text.trim();
		Pattern p = Pattern.compile(" +");
		Matcher m = p.matcher(text);

		for(int i = 0; i < text.length(); i++) {
			if(m.find()) {
				count++;
			}
		}
		count++;
		System.out.println("Amount of worlds in text: " + count);
	}
}
