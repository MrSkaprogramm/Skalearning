import java.util.Scanner;

public class WeekSchedule {

	public static void main(String[] args) {
		WeekSchedule weekschedule = new WeekSchedule();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day of week: ");
		int day = sc.nextInt();
		sc.close();
		System.out.println("Your plan for day: " + weekschedule.daySchedule(day));
	}
	
	public String daySchedule(int day) {
		switch(day) {
		case 1:
			return "Make coffee for dinner";
		case 2:
			return "Play football with elephant";
		case 3:
			return "Buy a telescope";
		case 4:
			return "Go to barbershop";
		case 5:
			return "Have a nice day";
		default:
			return "Another boring weekends";
		}
	}
}
