import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(3);
		List<Future<List<String>>> futures = new ArrayList<>();
		
		try {
			for(int i = 0; i < 10; i++) {
				futures.add(pool.submit(new GenerateFiles()));
			}
			
			for(Future<List<String>> currentFuture : futures) {
				System.out.println(currentFuture.get().toString());
			}
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}finally {
			pool.shutdown();
		}
	}
	
	public synchronized void writeFile(File file) {
		try(FileWriter writeFile = new FileWriter(file, true);) {
			for(int i = 0; i < 10; i++) {
				writeFile.write(generateRandomString() + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized String generateRandomString() {
		String alphabet = "abcdefghijklnopqrstuvwxyz";
		
		char[] string = new char[(int)(Math.random()*7)];
		
		for(int i = 0; i < string.length; i++) {
			string[i] = alphabet.charAt((int)(Math.random()*(alphabet.length() - 1) + 1));
		}
		
		return String.valueOf(string);
	}
}
