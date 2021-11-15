public class ConnectMinMax {
	
	byte byteMax = Byte.MAX_VALUE;
	byte byteMin = Byte.MIN_VALUE;
	short shortMin = Short.MIN_VALUE;
	short shortMax = Short.MAX_VALUE;
	int intMin = Integer.MIN_VALUE;
	int intMax = Integer.MAX_VALUE;
	long longMin = Long.MIN_VALUE;
	long longMax = Long.MAX_VALUE;
	float floatMin = Float.MIN_VALUE;
	float floatMax = Float.MAX_VALUE;
	double doubleMin = Double.MIN_VALUE;
	double doubleMax = Double.MAX_VALUE;

	public short increaseMax(short shortMax) {
		this.shortMax = ++shortMax;

		return shortMax;
	}

	public long increaseMax(long longMax) {
		this.longMax = ++longMax;

		return longMax;
	}

	public byte increaseMax(byte byteMax) {
		this.byteMax = ++byteMax;

		return byteMax;
	}

	public int increaseMax(int intMax) {
		this.intMax = ++intMax;

		return intMax;
	}

	public long decreaseMin(long longMin) {
		this.longMin = --longMin;

		return longMin;
	}

	public int decreaseMin(int intMin) {
		this.intMin = --intMin;

		return intMin;
	}

	public short decreaseMin(short shortMin) {
		this.shortMin = --shortMin;

		return shortMin;
	}

	public byte decreaseMin(byte byteMin) {
		this.byteMin = --byteMin;

		return byteMin;
	}

	public void printVariables(byte a, short b, int c, long d) {
		System.out.println("Переменной типа byte равно " + a);
		System.out.println("Переменной типа short равно " + b);
		System.out.println("Переменной типа int равно " + c);
		System.out.println("Переменной типа long равно " + d);
	}

	public static void main(String[] args) {
		ConnectMinMax connectMinMax = new ConnectMinMax();
		System.out.println("Стандартное максимальное значение " + "\n");
		connectMinMax.printVariables(connectMinMax.byteMin, connectMinMax.shortMin, connectMinMax.intMin, connectMinMax.longMin);
		System.out.println("\n" + "Стандартное минимальное значение " + "\n");
		connectMinMax.printVariables(connectMinMax.byteMax, connectMinMax.shortMax, connectMinMax.intMax, connectMinMax.longMax);
		connectMinMax.increaseMax(connectMinMax.byteMax);
		connectMinMax.increaseMax(connectMinMax.shortMax);
		connectMinMax.increaseMax(connectMinMax.intMax);
		connectMinMax.increaseMax(connectMinMax.longMax);
		System.out.println("\n" + "Увеличенное максимальное значение " + "\n");
		connectMinMax.printVariables(connectMinMax.byteMax, connectMinMax.shortMax, connectMinMax.intMax, connectMinMax.longMax);
		connectMinMax.decreaseMin(connectMinMax.byteMin);
		connectMinMax.decreaseMin(connectMinMax.shortMin);
		connectMinMax.decreaseMin(connectMinMax.intMin);
		connectMinMax.decreaseMin(connectMinMax.longMin);
		System.out.println("\n" + "Уменьшенное минимальное значение " + "\n");
		connectMinMax.printVariables(connectMinMax.byteMin, connectMinMax.shortMin, connectMinMax.intMin, connectMinMax.longMin);
	}

}
