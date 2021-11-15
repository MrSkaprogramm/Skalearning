public class Main {

	public static void main(String[] args) {
		MyByte myMaxByte = new MyByte(MyByte.maxValueByte);
		MyByte myMinByte = new MyByte(MyByte.minValueByte);
		System.out.println("Maximal MyByte value: " + myMaxByte.returnByte());
		System.out.println("Minimal MyByte value: " + myMinByte.returnByte());
		
		MyInteger myMaxInteger = new MyInteger(MyInteger.maxValueInteger);
		MyInteger myMinInteger = new MyInteger(MyInteger.minValueInteger);
		System.out.println("Maximal MyInteger value: " + myMaxInteger.returnInteger());
		System.out.println("Minimal MyInteger value: " + myMinInteger.returnInteger());
		
		MyLong myMaxLong = new MyLong(MyLong.maxValueLong);
		MyLong myMinLong = new MyLong(MyLong.minValueLong);
		System.out.println("Maximal MyLong value: " + myMaxLong.returnLong());
		System.out.println("Minimal MyLong value: " + myMinLong.returnLong());
		
		MyShort myMaxShort = new MyShort(MyShort.maxValueShort);
		MyShort myMinShort = new MyShort(MyShort.minValueShort);
		System.out.println("Maximal MyShort value: " + myMaxShort.returnShort());
		System.out.println("Minimal MyShort value: " + myMinShort.returnShort());
		
		myMaxByte.setUpperByte();
		myMinByte.setLowerByte();
		System.out.println("Increased maximal MyByte value: " + myMaxByte.returnByte());
		System.out.println("Decreased minimal MyByte value: " + myMinByte.returnByte());
		
		myMaxInteger.setUpperInteger();
		myMinInteger.setLowerInteger();
		System.out.println("Increased maximal MyInteger value: " + myMaxInteger.returnInteger());
		System.out.println("Decreased minimal MyInteger value: " + myMinInteger.returnInteger());
		
		myMaxLong.setUpperLong();
		myMinLong.setLowerLong();
		System.out.println("Increased maximal MyLong value: " + myMaxLong.returnLong());
		System.out.println("Decreased minimal MyLong value: " + myMinLong.returnLong());
		
		myMaxShort.setUpperShort();
		myMinShort.setLowerShort();
		System.out.println("Increased maximal MyShort value: " + myMaxShort.returnShort());
		System.out.println("Decreased minimal MyShort value: " + myMinShort.returnShort());
		

	}

}
