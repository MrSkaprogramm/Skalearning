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
			path = path + "\\IOTest";
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
		int x;
		String fileName = "Already";
		int fileNum;
		File file = new File(path, fileName);
		
		for(int i = 0; i < 5; i++) {
			x = (int)(Math.random()*100);
			fileName = "Already" + x + ".txt";
			file = new File(path, fileName);
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try (FileWriter writeFile = new FileWriter(file);){
				for(int j = 0; j < 10; j++) {
							fileNum = (int)(Math.random()*100);
							writeFile.write(Integer.toString(fileNum) + "\n");
				}
			} catch (IOException e) {
					e.printStackTrace();
			} 
		}
	}
	
	public void reWriteFiles(String path) {
		List<String> fileNumbers = new ArrayList<>();
		String dataFileName = "dataFile.txt";
		File files = new File(path);
		File reWriteFile = new File(path, dataFileName);
		String currentNum = null;
		BufferedReader fileReader = null;
		FileWriter writeNum = null;
			try {
				for(File currentFile : files.listFiles()) {
					fileReader = new BufferedReader(new FileReader(currentFile));
					currentNum = fileReader.readLine();
					while(currentNum != null) {
						fileNumbers.add(currentNum);
						currentNum = fileReader.readLine();
					}
					
					reWriteFile.createNewFile();
					writeNum = new FileWriter(reWriteFile);
					for(int i = 0; i < fileNumbers.size(); i++) {
						writeNum.write(fileNumbers.get(i) + "\n");
					}
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					fileReader.close();
					writeNum.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
	}
	
	public void createListFiles(String path) {
		String listName = "catalogList.txt";
		File listFiles = new File(path, listName);
		File dir = new File(path);
		try (FileWriter writeList = new FileWriter(listFiles);){
			listFiles.createNewFile();
			for(File currentFile : dir.listFiles()) {
				writeList.write(currentFile.getName() + "\n");
			}
			writeList.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
