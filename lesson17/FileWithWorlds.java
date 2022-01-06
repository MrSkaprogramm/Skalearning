import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWithWorlds {

	public static void main(String[] args) {
		FileWithWorlds fileWords = new FileWithWorlds();
		fileWords.createNewFile();
	}
	
	public void createNewFile() {
		File file = new File("FileWithWorlds.txt");
		String text = "In today's race participating in race: \n 1 - Robot78585 \n 2 - DroneAH4381 \n 3 - RC Car F1";
		System.out.println("Text: \n" + "----------------\n" + text + "\n" + "----------------" + "\n");
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
		findWordsInText(file);
		findPunctuatipnInText(file);
	}
	
	public void findWordsInText(File file) {
		try {
			BufferedReader fileReader = new BufferedReader(new FileReader(file));
			String currentString = fileReader.readLine();
			int countWords = 0;
			while(currentString != null) {
				String countThereWords = currentString.trim();
				countThereWords = countThereWords.replace('-', ' ');
				countThereWords = countThereWords.replaceAll(" +", " ");
				System.out.println(countThereWords);
				for(int i = 0; i < countThereWords.length(); i++) {
					if(String.valueOf(countThereWords.charAt(i)).matches(" ")) {
						countWords++;
					}
				}
				countWords++;
				currentString = fileReader.readLine();
			}
			fileReader.close();
			System.out.println("Amount of words in text: " + countWords);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public void findPunctuatipnInText(File file) {
		try {
			FileReader fileReader = new FileReader(file);
			int symbol = fileReader.read();
			int countPunctuation = 0;
			while((symbol = fileReader.read()) != -1) {
				if(String.valueOf((char)symbol).matches("[\"\\!',;:.?-]")) {
					countPunctuation++;
				}
			}
			fileReader.close();
			System.out.println("Amount punctuation in text: " + countPunctuation);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
