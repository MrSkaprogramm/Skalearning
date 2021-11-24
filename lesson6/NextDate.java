import java.util.Scanner;

public class NextDate {
		static Scanner sc = new Scanner(System.in);
		
		public static void main(String[] args) {
			int mounth = 0;
			int day = 0;
			double year = 0.0;
			boolean bigYear = false;

			mounth = defineCurrentMounth(mounth);
			year = defineCurrentYear(year);
			bigYear = defineIsBigYear(year, bigYear);
			day = defineCurrentDay(day, mounth, bigYear);
			System.out.println(defineNextDate(mounth, day, year, bigYear));
		}
		
		public static int defineCurrentMounth(int mounth) {
			while(mounth <=0 || mounth >=13){
				System.out. println("Enter mounth");
				mounth = sc.nextInt();
			}
			return mounth;
		}
		public static double defineCurrentYear(double year) {
			System.out.println("Enter year");
			year = sc.nextInt();
			return year;
		}
		public static boolean defineIsBigYear(double year, boolean bigYear) {
			if((year/4)%1 == 0 && (year/100)%1 != 0) {
				bigYear = true;
			} else if((year/4)%1 == 0 && (year/100)%1 == 0) {
				if((year/100)%1 == 0 && (year/400)%1 == 0) {
					bigYear = true;
				}
			}else {
				bigYear = false;
			}
			return bigYear;
		}
		public static int defineCurrentDay(int day, int mounth, boolean bigYear) {
			switch(mounth) {
				case 1, 3, 5, 7, 8, 10, 12:
					while(day <=0 || day >=32){
						System.out. println("Enter day");
						day = sc.nextInt();
					}
					break;
				case 4, 6, 9, 11:
					while(day <=0 || day >=31){
						System.out. println("Enter day");
						day = sc.nextInt();
					}
					break;
				case 2:
					if(bigYear = true) {
						while(day <=0 || day >=30){
							System.out. println("Enter day");
							day = sc.nextInt();
						}
				}else {
					while(day <=0 || day >=29){
						System.out. println("Enter day");
						day = sc.nextInt();
					}
				break;
				}
			}
			return day;
		}
		public static String defineNextDate(int mounth, int day, double year, boolean bigYear) {
			switch(mounth) {
				case 12:
					if(day < 31) {
						++day;
					} else {
						++year;
						day = 1;
						mounth = 1;
					}
					break;
				case 2:
					if(bigYear) {
						if(day < 29) {
							++day;
						}else {
							++mounth;
							day = 1;
						}
					}else{
						if(day < 28) {
							++day;
						}else {
							++mounth;
							day = 1;
						}
					}
					break;
				case 4, 6, 9, 11:
						if(day < 30) {
							++day;
						}else {
							++mounth;
							day = 1;
						}
					break;
				case 1, 3, 5, 7, 8, 10:
						if(day < 31) {
							++day;
						}else {
							++mounth;
							day = 1;
						}
					break;
			
			}
			return "Next day is: " + day + "." + mounth + "." + (int)year;
		}
}
