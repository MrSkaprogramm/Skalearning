import java.util.Scanner;

public class ViewNextSeason {
	
		public void viewSeason(String currentSeason) {
			boolean equalsSeason = false;
			for(YearSeason season:YearSeason.values()) {
				if(equalsSeason) {
					System.out.println("Next season is: " + season.getDescription());
					break;
				}
				if(season.getDescription().equalsIgnoreCase(currentSeason)) {
					equalsSeason = true;
					if(YearSeason.SUMMER.equals(season)) {
						System.out.println("Next season is: " + YearSeason.AUTUMN.getDescription());
					}
				}
			}
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			ViewNextSeason nextSeason = new ViewNextSeason();
			System.out.println("Enter current season: ");
			String currentSeason = sc.nextLine();
			sc.close();
			
			nextSeason.viewSeason(currentSeason);
		}
}
