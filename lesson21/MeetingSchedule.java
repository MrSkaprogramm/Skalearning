import java.time.LocalDateTime;

public class MeetingSchedule {
	private final static int hour = 13;
	
	public static void main(String[] args) {
		LocalDateTime currentDate = LocalDateTime.now();
		int period;
		
		if(currentDate.getHour() < hour) {
			period = currentDate.plusMonths(2).getDayOfYear() - currentDate.getDayOfYear();
		}else {
			period = currentDate.plusMonths(2).plusDays(1).getDayOfYear() - currentDate.getDayOfYear();
		}
		
		for(int i = 0; i < period; i++) {
			if(i % 7 == 0) {
				System.out.println("Next meeting at: " + currentDate.plusDays(i).withHour(hour));
			}
		}
	}
}
