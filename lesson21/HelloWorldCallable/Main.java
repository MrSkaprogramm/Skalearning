import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(3);
		List<Future<String>> futures = new ArrayList<>();
		
		try {
			for(int i = 0; i < 10; i++) {
				futures.add(pool.submit(new HelloFile()));
			}
			
			for(Future<String> currentFuture : futures) {
				System.out.println(currentFuture.get());
			}
		}catch(ExecutionException e) {
			e.printStackTrace();
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}finally {
			pool.shutdown();
		}
	}
	
	public synchronized void writeFile(String text) {
		File file = new File(Paths.get("").toAbsolutePath().toString(), "CallableHello!.txt");
		if(!file.exists()) {
			try {
				System.out.println("create file");
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try(FileWriter writeFile = new FileWriter(file, true);) {
			writeFile.write(text + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
