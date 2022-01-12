import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class RandomNumbers {
	private static final int AMOUNT_OF_NUMBERS = 20;

	public static void main(String[] args) {
		RandomNumbers readBinary = new RandomNumbers();
		String fileName = "out.bin";
		readBinary.createBinFile(fileName);
		readBinary.readBinFile(fileName);
	}
	
	public void createBinFile(String fileName) {
		try(FileOutputStream fileOs = new FileOutputStream(fileName); ObjectOutputStream objectOs = new ObjectOutputStream(fileOs);) {
			int randomNum;
			for(int i = 0; i < AMOUNT_OF_NUMBERS ; i++) {
				randomNum = (int)(Math.random()*100);
				objectOs.writeInt(randomNum);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done writing. Now reading...");
	}
	
	public void readBinFile(String fileName) {
		try(FileInputStream fileIn = new FileInputStream(fileName); ObjectInputStream readFile = new ObjectInputStream(fileIn);) {
			int x;
			int sumNumbers = 0;
			while(readFile.available() > 0) {
				x = readFile.readInt();
				System.out.print(x + " ");
				sumNumbers += x;
			}
			System.out.print("\nArithmetic mean of numbers in file is: " + sumNumbers/AMOUNT_OF_NUMBERS);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
