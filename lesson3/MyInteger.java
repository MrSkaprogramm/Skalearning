public class MyInteger {
	private int currentInteger;
	static int maxValueInteger = Integer.MAX_VALUE;
	static int minValueInteger = Integer.MIN_VALUE;
	
	public MyInteger(int currentInteger) {
		this.currentInteger = currentInteger;
	}
	
	public void setUpperInteger() {
		this.currentInteger = ++currentInteger;
	}
	public void setLowerInteger() {
		this.currentInteger = --currentInteger;
	}
	public int returnInteger() {
		return currentInteger;
	}
}
