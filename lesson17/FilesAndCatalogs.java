import java.io.File;
import java.nio.file.Paths;

public class FilesAndCatalogs {

	public static void main(String[] args) {
		FilesAndCatalogs viewFilesAndCatalogs = new FilesAndCatalogs();
		File dir = new File(Paths.get("").toAbsolutePath().toString());
		viewFilesAndCatalogs.printCatalogs(dir);
		viewFilesAndCatalogs.printFiles(dir);
	}
	
	public void printCatalogs(File dir) {
		System.out.println("List of directories in directory:");
		for(File currentDir:dir.listFiles()) {
			if(currentDir.isDirectory()) {
				System.out.println(currentDir.getName());
			}
		}
	}

	public void printFiles(File dir) {
		System.out.println("\n List of files in directory:");
		for(File currentDir:dir.listFiles()) {
			if(currentDir.isFile()) {
				System.out.println(currentDir.getName());
			}
		}
	}
}
