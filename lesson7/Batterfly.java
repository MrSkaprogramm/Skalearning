import java.util.Scanner;

public class Batterfly {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount of array elements:");
		int n = sc.nextInt();
		sc.close();
		int[][] array = new int[n][n];
		
		for(int i = 0; i < array.length; i++) {
			if(i == 0) {
				for(int j = 0; j < array.length; j++) {
					array[i][j] = 1;
					System.out.print(array[i][j] + " ");
				}
			} else if(i <= array.length / 2) {
				for(int j = 0; j < i; j++) {
					array[i][j] = 0;
					System.out.print(array[i][j] + " ");
				}
				for(int j = i; j < array.length - i; j++) {
					array[i][j] = 1;
					System.out.print(array[i][j] + " ");
				}
				for(int j = array.length - i; j < array.length; j++) {
					array[i][j] = 0;
					System.out.print(array[i][j] + " ");
				}
			}else if(i < array.length - 1) {
				for(int j = array.length - 1; j > i; j--) {
					array[i][j] = 0;
					System.out.print(array[i][j] + " ");
				}
				for(int j = i + 1; j >= array.length - i; j--) {
					array[i][j] = 1;
					System.out.print(array[i][j] + " ");
				}
				for(int j = array.length - i - 1; j > 0; j--) {
					array[i][j] = 0;
					System.out.print(array[i][j] + " ");
				}
			}else if(i == array.length - 1) {
				for(int j = 0; j < array.length; j++) {
					array[i][j] = 1;
					System.out.print(array[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
