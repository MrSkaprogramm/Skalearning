public class WiewYearSeason {

	public static void main(String[] args) {
		for(YearSeason season:YearSeason.values()) {
			System.out.println("Season: " + season.getDescription());
			System.out.println("Amount of days in seasion: " + season.getCountOfDays());
		}
	}
}
