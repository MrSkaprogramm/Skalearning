import java.util.Scanner;

public class ViewAmountOfDaysSeason {
	public void viewAmountOfDays(String currentSeason) {
		for(YearSeason season:YearSeason.values()) {
			if(currentSeason.equalsIgnoreCase(season.getDescription())) {
				System.out.println("Amount of days in season " + season.getDescription() + " is: " + season.getCountOfDays());
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ViewAmountOfDaysSeason amountOfDays = new ViewAmountOfDaysSeason();
		System.out.println("Enter current season: ");
		String currentSeason = sc.nextLine();
		sc.close();
		
		amountOfDays.viewAmountOfDays(currentSeason);
	}
}
