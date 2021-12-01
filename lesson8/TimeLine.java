public class TimeLine {
	int seconds;
	int minutes;
	int hours;
	Integer allSeconds;
	
	public TimeLine(Integer allSeconds) {
		this.allSeconds = allSeconds;
	}

	public TimeLine(int seconds, int minutes, int hours) {
		this.seconds = seconds;
		this.minutes = minutes;
		this.hours = hours;
	}

	public static void main(String[] args) {
		TimeLine timeline1 = new TimeLine(1000000);
		TimeLine timeline2 = new TimeLine(500, 1500, 15000);
		timeline2.allSeconds = timeline2.getAllSeconds(timeline2.seconds, timeline2.minutes, timeline2.hours);
		timeline1.printData(timeline1, timeline2);
		
	}

	public int getAllSeconds(int seconds, int minutes, int hours) {
		allSeconds = minutes * 60 + hours*3600 + seconds;
		return allSeconds;
	}

	public int compareTo(TimeLine timeline2) {
		int result = this.allSeconds.compareTo(timeline2.allSeconds);
		return result;
	}

	public void printData(TimeLine timeline1, TimeLine timeline2) {
		System.out.println("Total number of seconds of the first timeline is: " + timeline1.allSeconds);
		System.out.println("Total number of seconds of the second timeline is: " + timeline2.allSeconds);
		System.out.println("Result of comparsion timeline1 and timeline2: " + timeline1.compareTo(timeline2));
	}
}
