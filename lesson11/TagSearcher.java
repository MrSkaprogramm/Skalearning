import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TagSearcher {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String, whitch contains tags");
		String tags = sc.nextLine();
		String tag = "<p>";
		Pattern p = Pattern.compile("<*p* *\t* *\\S*>");
		Matcher m = p.matcher(tags);

		StringBuilder buildTags = new StringBuilder(tags);
		int compareStrings = 0;
		int count = 0;
		int oldLength = 0;
		while(m.find()) {
			if(count == 0) {
				buildTags.replace(m.start(), m.end(), tag);
				oldLength = m.end() - m.start();
				count++;
			}else if(count >= 1) {
				compareStrings = compareStrings + (oldLength - tag.length());
				buildTags.replace((m.start() - compareStrings), (m.end() - compareStrings), tag);
				oldLength = m.end() - m.start();
				count++;
			}
		}
		
		System.out.println("Your string with only simple tags:" + "\n" + buildTags.toString());
	}
}
