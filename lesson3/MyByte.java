public class MyByte {
	private byte currentByte;
	static byte maxValueByte = Byte.MAX_VALUE;
	static byte minValueByte = Byte.MIN_VALUE;
	
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
