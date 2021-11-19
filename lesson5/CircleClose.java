import java.util.Scanner;

public class CircleClose {

	public static void main(String[] args) {
		CircleClose isClose = new CircleClose();
		int holeLength;
		int holeWidth;
		int circleDiameter;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the hole length:");
		holeLength = sc.nextInt();
		System.out.println("Enter the hole width:");
		holeWidth = sc.nextInt();
		System.out.println("Enter the circle radius:");
		circleDiameter = sc.nextInt();
		sc.close();
		
		System.out.println(isClose.circleClose(holeLength, holeWidth, circleDiameter));
	}

	public String circleClose(int holeLength, int holeWidth, int circleDiameter) {
		int holeDiagonal = (int) Math.sqrt(Math.pow(holeLength, 2) + Math.pow(holeWidth, 2));
		if(circleDiameter >= holeDiagonal) {
			return ("The circle closes the hole");
		}else {
			return ("The circle doesen't closes the hole");
		}
	}
}
