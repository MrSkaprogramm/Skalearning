public class MyByte {
	private byte currentByte;
	static final byte maxValueByte = Byte.MAX_VALUE;
	static final byte minValueByte = Byte.MIN_VALUE;
	
	public MyByte(byte currentByte) {
		this.currentByte = currentByte;
	}
	
	public void setUpperByte() {
		this.currentByte = ++currentByte;
	}
	public void setLowerByte() {
		this.currentByte = --currentByte;
	}
	public int returnByte() {
		return currentByte;
	}
}
