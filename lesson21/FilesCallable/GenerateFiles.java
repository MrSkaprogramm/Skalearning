import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class GenerateFiles implements Callable<List<String>>{
	private static final int MILLIS_IN_SEC = 1000;

	@Override
	public List<String> call() throws Exception {
		Main main = new Main();
		List<String> fileNames = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			String fileName = "Generate" + String.valueOf((int)(Math.random()*1000) + ".txt");
			File file = new File(Paths.get("").toAbsolutePath().toString(), fileName);
			
			if(!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			main.writeFile(file);
			fileNames.add(fileName);
		}
		Thread.sleep((int)(Math.random()*MILLIS_IN_SEC)*3);
		System.out.println(Thread.currentThread().getName());
		
		return fileNames;
	}
}
