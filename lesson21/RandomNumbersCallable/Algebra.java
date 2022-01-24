import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Algebra {

	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(3);
		List<Future<String>> futures = new ArrayList<>();
		
		try {
			for(int i = 0; i < 10; i++) {
				futures.add(pool.submit(new Numbers()));
			}
			
			for(Future<String> currentFuture : futures) {
				System.out.println(currentFuture.get());
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}catch(ExecutionException ex) {
			ex.printStackTrace();
		}finally {
			pool.shutdown();
		}
	}
}
