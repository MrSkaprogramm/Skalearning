import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FindMostRepeating {

	public static void main(String[] args) {
		FindMostRepeating repeatWorld = new FindMostRepeating();
		repeatWorld.createFile();
	}
	
	public void createFile() {
		File file = new File("FindMostRepeating.txt");
		String text = "In today's race participating in race: \n 1 - Robot 78585 \n 2 - Drone AH4381 \n 3 - RC Car F1";
		
		try(FileWriter fileWriter = new FileWriter(file);) {
			if(!file.exists()) {
				file.createNewFile();
			}
				
			fileWriter.write(text);
			fileWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		findAllWords(file);
	}
	
	public void findAllWords(File file) {
		System.out.println("start currentString ");
		boolean isFirst = false;
		int firstIndex = 0;
		int secondIndex = 0;
		List<String> strings = new ArrayList<>();
		try(BufferedReader fileReader = new BufferedReader(new FileReader(file));) {
			String currentString = fileReader.readLine();
			String totalString;
			while(currentString != null) {
				currentString.trim();
				System.out.println("currentString " + currentString);
				for(int i = 0; i < currentString.length(); i++) {
					if(isFirst == false) {
						firstIndex = i;
						isFirst = true;
						continue;
					}else if(isFirst == true && String.valueOf(currentString.charAt(i)).matches(" ")) {
						secondIndex = i;
					}else if(isFirst == true && i == currentString.length() - 1) {
						secondIndex = i + 1;
					}else {
						continue;
					}
					totalString = currentString.substring(firstIndex, secondIndex);
					totalString = totalString.replaceAll("[\"\\!',;:.?-]", "");
					if(totalString.matches("[a-zA-Z]+")){
						strings.add(totalString);
					}
					isFirst = false;
				}
				currentString = fileReader.readLine();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		for(String currentWord : strings) {
			System.out.println(currentWord + " ");
		}
		findMostRepeating(strings);
	}
	
	public void findMostRepeating(List<String> strings) {
		int count = 0;
		int biggestCount = 0;
		String repeatingString = null; 
		for(int i = 0; i < strings.size(); i++) {
			for(int j = i + 1; j < strings.size(); j++) {
				if(strings.get(i).equalsIgnoreCase(strings.get(j))) {
					count++;
				}
			}
			if(biggestCount < count) {
				biggestCount = count;
				repeatingString = strings.get(i);
			}
			count = 0;
		}
		System.out.println("Most repeating word is " + repeatingString);
	}
}
