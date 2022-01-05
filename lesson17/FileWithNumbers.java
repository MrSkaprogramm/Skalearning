import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileWithNumbers {

	public static void main(String[] args) {
		FileWithNumbers fileNumbers = new FileWithNumbers();
		fileNumbers.createNewFile();
	}
	
	public void createNewFile() {
		File file = new File("temp.txt");
		String text = "In today's race participating in race: \n 1 - Robot78585 \n 2 - DroneAH4381 \n 3 - RC Car F1";
		try {
			if(!file.exists()) {
				file.createNewFile();
			}
			FileWriter fileWriter = new FileWriter(file);
			
			fileWriter.write(text);
			fileWriter.flush();
			fileWriter.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		findNumbersInText(file);
	}
	
	public void findNumbersInText(File file) {
		List<Integer> numbers = new ArrayList<>();
		int sum = 0;
		System.out.println("All text numbers:");
		try {
			FileReader fileReader = new FileReader(file);
			int res  = fileReader.read();
			while(res != -1) {
				if(String.valueOf((char)res).matches("[0-9]")){
					System.out.print(Integer.parseInt(String.valueOf((char)res)));
					numbers.add(Integer.parseInt(String.valueOf((char)res)));
					sum += Integer.parseInt(String.valueOf((char)res));
				}
				res = fileReader.read();
			}
			fileReader.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("\nSum of numbers in text is: " + sum);
		deleteRepeatingNumbers(numbers);
	}
		
	public void deleteRepeatingNumbers(List<Integer> numbers) {
		for(int i = 0; i < numbers.size(); i++) {
			for(int j = i + 1; j < numbers.size(); j++) {
				if(numbers.get(i) == numbers.get(j)) {
					numbers.remove(j);
					j--;
				}
			}
		}
		
		System.out.println("All text numbers without repeating numbers:");
		for(Integer currentNum : numbers) {
			System.out.print(currentNum);
		}
	}
}
