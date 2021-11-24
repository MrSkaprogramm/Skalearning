public class HouseGrounds {
	public static void main(String[] args) {
		double firstHouseLength = 0.0;
		double firstHouseWidth = 0.0;
		double secondHouseLenght = 0.0;
		double secondHouseWidth = 0.0;
		double groundLength = 0.0;
		double groundWidth = 0.0;
		double biggestLength = 0.0;
		double biggestWidth = 0.0;
		String isGoodGround = null;
		Scanner sc = new Scanner(System.in);
		while(firstHouseLength <= 0) {
			System.out.println("Enter the first house length");
			firstHouseLength = sc.nextDouble();
		}
		while(firstHouseWidth <= 0) {
			System.out.println("Enter the first house width");
			firstHouseWidth = sc.nextDouble();
		}
		while(secondHouseLenght <= 0) {
			System.out.println("Enter the second house length");
			secondHouseLenght = sc.nextDouble();
		}
		while(secondHouseWidth <= 0) {
			System.out.println("Enter the second house width");
			secondHouseWidth = sc.nextDouble();
		}
		while(groundLength <= 0) {
			System.out.println("Enter the ground length");
			groundLength = sc.nextDouble();
		}
		while(groundWidth <= 0) {
			System.out.println("Enter the ground width");
			groundWidth = sc.nextDouble();
		}
		biggestLength = defineBiggestLength(firstHouseLength, firstHouseWidth, secondHouseLenght, secondHouseWidth, biggestLength);
		biggestWidth = definebiggestWidth(firstHouseLength, firstHouseWidth, secondHouseLenght, secondHouseWidth, biggestLength, biggestWidth);
		isGoodGround = defineGoodGroung(groundLength, groundWidth, isGoodGround, biggestLength, biggestWidth);
		System.out.println(isGoodGround);
	}

	public static double defineBiggestLength(double firstHouseLength, double firstHouseWidth, double secondHouseLenght, double secondHouseWidth, double biggestLength) {
		if(firstHouseLength > firstHouseWidth) {
			if(secondHouseLenght > secondHouseWidth) {
				biggestLength = firstHouseLength + secondHouseLenght;
			}else {
				biggestLength = firstHouseLength + secondHouseWidth;
			}
		} else{
			if(secondHouseLenght > secondHouseWidth) {
				biggestLength = firstHouseWidth + secondHouseLenght;
			}else {
				biggestLength = firstHouseWidth + secondHouseWidth;
			}
		}
		return biggestLength;
	}

	public static double definebiggestWidth(double firstHouseLength, double firstHouseWidth, double secondHouseLenght, double secondHouseWidth, double biggestLength, double biggestWidth) {
		if(biggestLength == (firstHouseWidth + secondHouseWidth)) {
			if(firstHouseLength > secondHouseLenght) {
				biggestWidth = firstHouseLength;
			}else {
				biggestWidth = secondHouseLenght;
			}
		}else if(biggestLength == (firstHouseLength + secondHouseLenght)) {
			if(firstHouseWidth > secondHouseWidth) {
				biggestWidth = firstHouseWidth;
			}else {
				biggestWidth = secondHouseWidth;
			}
		}else if(biggestLength == (firstHouseLength + secondHouseWidth)) {
			if(firstHouseWidth > secondHouseLenght) {
				biggestWidth = firstHouseWidth;
			}else {
				biggestWidth = secondHouseLenght;
			}
		}else if(biggestLength == (firstHouseWidth + firstHouseLength)) {
			if(firstHouseLength > secondHouseWidth) {
				biggestWidth = firstHouseLength;
			}else {
				biggestWidth = secondHouseWidth;
			}
		}
		return biggestWidth;
	}
	public static String defineGoodGroung(double groundLength, double groundWidth, String isGoodGround, double biggestLength, double biggestWidth) {
		if(groundLength > groundWidth) {
			if(groundLength > biggestLength) {
				if(groundWidth > biggestWidth) {
						isGoodGround = "Can build";
				} else{
					isGoodGround = "Need to extend ground";
				}
			}else {
				isGoodGround = "Need to extend ground";
			}
		}else {
			if(groundWidth > biggestLength) {
				if(groundLength > biggestWidth) {
					isGoodGround = "Can build";
				}else {
					isGoodGround = "Need to extend ground";
				}
			}else {
				isGoodGround = "Need to extend ground";
			}
		}
		return isGoodGround;
	}
}
