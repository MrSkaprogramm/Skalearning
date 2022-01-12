import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FilesInDirectories {

	public static void main(String[] args) {
		FilesInDirectories filesDirectories = new FilesInDirectories();
		String path = "C:\\Users\\ska77\\eclipse-workspace\\IT - academy homework\\IOTest";
		
		filesDirectories.makeDirectories(path);
	}
	
	public void makeDirectories(String path) {
		File directly = new File(path);
		if(!directly.exists()) {
			directly.mkdir();
			System.out.println("Successfully");
		}else {
			System.out.println("Already");
		}
		path = path + "\\IOTest1";
		File directly1 = new File(path);
		if(!directly1.exists()) {
			directly1.mkdir();
			System.out.println("Successfully");
		}else {
			System.out.println("Already");
		}
		path = path + "\\IOTest2";
		File directly2 = new File(path);
		if(!directly2.exists()) {
			directly2.mkdir();
			System.out.println("Successfully");
		}else {
			System.out.println("Already");
		}
		createFiles(path);
		reWriteFiles(path);
		createListFiles(path);
	}
	
	public void createFiles(String path) {
		String fileName = null;
		try {
			int x;
			fileName = "Already";
			int fileNum;
			for(int i = 0; i < 5; i++) {
				x = (int)(Math.random()*100);
				fileName = "Already" + x + ".txt";
				File file = new File(path, fileName);
				file.createNewFile();
				
				FileWriter writeFile = new FileWriter(file);
				for(int j = 0; j < 10; j++) {
					fileNum = (int)(Math.random()*100);
					writeFile.write(Integer.toString(fileNum) + "\n");
				}
				writeFile.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void reWriteFiles(String path) {
		List<String> fileNumbers = new ArrayList<>();
		String dataFileName = "dataFile.txt";
		File files = new File(path);
		File reWriteFile = new File(path, dataFileName);
		String currentNum = null;
			try {
				for(File currentFile : files.listFiles()) {
					BufferedReader fileReader = new BufferedReader(new FileReader(currentFile));
					currentNum = fileReader.readLine();
					while(currentNum != null) {
						fileNumbers.add(currentNum);
						currentNum = fileReader.readLine();
					}
					fileReader.close();
					
					reWriteFile.createNewFile();
					FileWriter writeNum = new FileWriter(reWriteFile);
					for(int i = 0; i < fileNumbers.size(); i++) {
						writeNum.write(fileNumbers.get(i) + "\n");
					}
					writeNum.close();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public void createListFiles(String path) {
		String listName = "catalogList.txt";
		File listFiles = new File(path, listName);
		File dir = new File(path);
		try {
			listFiles.createNewFile();
			FileWriter writeList = new FileWriter(listFiles);
			for(File currentFile : dir.listFiles()) {
				writeList.write(currentFile.getName() + "\n");
			}
			writeList.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}