import java.time.LocalDate;

public class SixtyDaysAgo {

	public static void main(String[] args) {
		LocalDate beforeDate = LocalDate.now();
		
		System.out.println("60 days ago is: " + beforeDate.minusDays(60));
	}
}
