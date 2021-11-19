import java.util.Scanner;

public class DateInSeconds {

	public static void main(String[] args) {
		DateInSeconds date = new DateInSeconds();
		Scanner sc = new Scanner(System.in);
		int weeks = Integer.MIN_VALUE;
		int days = Integer.MIN_VALUE;
		int hours = Integer.MIN_VALUE;
		int minutes = Integer.MIN_VALUE;
		int seconds = Integer.MIN_VALUE;
		System.out.println("Enter the amount of time in seconds:");
		int time = sc.nextInt();
		sc.close();
		
		System.out.println ("Fully date converted from seconds is: " + date.dateInSeconds(time, weeks, days, hours, minutes, seconds));

	}

	public String dateInSeconds(int time, int weeks, int days, int hours, int minutes, int seconds) {
		weeks = time / (7*24*60*60);
		days = (time % (weeks * (7*24*60*60))) / (24*60*60);
		hours = (time % (weeks * (7*24*60*60) + days * (24*60*60))) / (60*60);
		minutes = (time % (weeks * (7*24*60*60) + days * (24*60*60) + hours * (60*60))) / 60;
		seconds = (time % (weeks * (7*24*60*60) + days * (24*60*60) + hours * (60*60) + minutes * 60)) % 60;
		return weeks + " weeks " + days + " days " + hours + " hours " + minutes + " minutes " + seconds + " seconds ";
	}

}
