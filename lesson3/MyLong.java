public class MyLong {
	private long currentLong;
	static long maxValueLong = Long.MAX_VALUE;
	static long minValueLong = Long.MIN_VALUE;
	
	public MyLong(long currentLong) {
		this.currentLong = currentLong;
	}
	
	public void setUpperLong() {
		this.currentLong = ++currentLong;
	}
	public void setLowerLong() {
		this.currentLong = --currentLong;
	}
	public long returnLong() {
		return currentLong;
	}
}
