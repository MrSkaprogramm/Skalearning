import java.util.Scanner;

public class DateInSeconds {

	public static void main(String[] args) {
		DateInSeconds date = new DateInSeconds();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount of time in seconds:");
		int time = sc.nextInt();
		sc.close();
		
		System.out.println ("Fully date converted from seconds is: " + date.dateInSeconds(time));

	}

	public String dateInSeconds(int time) {
		int weeks = time / (7*24*60*60);
		int days = (time % (weeks * (7*24*60*60))) / (24*60*60);
		int hours = (time % (weeks * (7*24*60*60) + days * (24*60*60))) / (60*60);
		int minutes = (time % (weeks * (7*24*60*60) + days * (24*60*60) + hours * (60*60))) / 60;
		int seconds = (time % (weeks * (7*24*60*60) + days * (24*60*60) + hours * (60*60) + minutes * 60)) % 60;
		return weeks + " weeks " + days + " days " + hours + " hours " + minutes + " minutes " + seconds + " seconds ";
	}

}
