import java.util.Scanner;

public class ControlCenter {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Codes nuclearCode = new Codes();
		
		try {
			System.out.println("Enter the nuclear bombs code:");
			nuclearCode.setCode(sc.nextInt());
		} catch (ArmageddonException bigBoom) {
			bigBoom.printStackTrace();
			System.out.println("Bombs successfully deactivated!");
		}finally {
			System.out.println("The bomb launching system is operating normally");
		}
		sc.close();
	}
}
