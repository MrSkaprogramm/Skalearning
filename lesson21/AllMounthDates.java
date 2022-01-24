import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AllMounthDates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your current mounth: ");
		int mounth = sc.nextInt();
		sc.close();
		
		LocalDate mounthDate = LocalDate.of(Year.now().getValue(), mounth, 1);
		
		for(int i = 1; i <= mounthDate.lengthOfMonth(); i++) {
			System.out.println(LocalDate.of(Year.now().getValue(), mounth, i).format(DateTimeFormatter.ofPattern("d::MM::uuuu")));
		}
	}
}
