public class ConnectMinMax {

		byte byteMax = Byte.MAX_VALUE;
		byte byteMin = Byte.MIN_VALUE;
		short shortMin = Short.MIN_VALUE;
		short shortMax = Short.MAX_VALUE);
		int intMin = Integer.MIN_VALUE;
		int intMax = Integer.MAX_VALUE;
		long longMin = Long.MIN_VALUE;
		long longMax = Long.MAX_VALUE;
		float floatMin = Float.MIN_VALUE;
		float floatMax = Float.MAX_VALUE;
		double doubleMin = Double.MIN_VALUE;
		double doubleMax = Double.MAX_VALUE;

	public short increaseMax(short shortMax) {
		this.shortMax = shortMax + 1;
    
    return shortMax;
	}

	public long increaseMax(long longMax) {
		this.longMax = longMax + 1;
    
    return longMax;
	}

	public byte increaseMax(byte byteMax) {
		this.byteMax = byteMax + 1;

		return byteMax;
	}
	
	public int increaseMax(int intMax) {
		this.intMax = intMax + 1;

		return intMax;
	}

	public long decreaseMin(long longMin) {
		this.longMin = longMin - 1;

		return longMin;
	}

	public int decreaseMin(int intMin) {
		this.intMin = intMin - 1;

		return intMin;
	}

	public short decreaseMin(short shortMin) {
		this.shortMin = shortMin - 1;

		return shortMin;
	}

	public byte decreaseMin(byte byteMin) {
		this.byteMin = byteMin - 1;

		return byteMin;
	}

	public void printVariables(byte a, short b, int c, long d) {
		System.out.println("Переменная типа byte равна " + a);
		System.out.println("Переменная типа short равна " + b);
		System.out.println("Переменная типа int равна " + c);
		System.out.println("Переменная типа long равна " + d);
	}

	public static void main(String[] args) {
		ConnectMinMax.connectMinMax = new ConnectMinMax();
		connectMinMax.printVariables(byteMin, shortMin, intMin, longMin);
		connectMinMax.printVariables(byteMax, shortMax, intMax, longMax);
		connectMinMax.increaseMax(byteMax);
		connectMinMax.increaseMax(shortMax);
		connectMinMax.increaseMax(intMax);
		connectMinMax.increaseMax(longMax);
		connectMinMax.printVariables(byteMax, shortMax, intMax, longMax);
		connectMinMax.decreaseMin(byteMin);
		connectMinMax.decreaseMin(shortMin);
		connectMinMax.decreaseMin(intMin);
		connectMinMax.decreaseMin(longMin);
		connectMinMax.printVariables(byteMin, shortMin, intMin, longMin);
	}
}
