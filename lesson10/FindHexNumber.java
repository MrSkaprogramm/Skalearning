import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindHexNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String hexNumber = null;
		System.out.println("Enter the line:");
		String whereIsHex = sc.nextLine();
		sc.close();
		
		Pattern p = Pattern.compile("0[x{1}X{1}][0-9a-fA-F]+");
		Matcher m = p.matcher(whereIsHex);
		
		while(m.find()) {
			if(m.end() - m.start() <= 18) {
				hexNumber = whereIsHex.substring(m.start(), m.end());
			}else {
				continue;
			}
			
			sb.append(hexNumber);
			sb.append(" ");
		}
		System.out.println("All hex numbers in the line: " + sb.toString());
	}
}
