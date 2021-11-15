public class MyShort {
	private short currentShort;
	static short maxValueShort = Short.MAX_VALUE;
	static short minValueShort = Short.MIN_VALUE;
	
	public MyShort(short currentShort) {
		this.currentShort = currentShort;
	}
	
	public void setUpperShort() {
		this.currentShort = ++currentShort;
	}
	public void setLowerShort() {
		this.currentShort = --currentShort;
	}
	public short returnShort() {
		return currentShort;
	}
}
