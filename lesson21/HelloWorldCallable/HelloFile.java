import java.time.LocalTime;
import java.util.concurrent.Callable;

public class HelloFile implements Callable<String> {

	@Override
	public String call() throws Exception {
		Main main = new Main();
		LocalTime time = LocalTime.now();
		String hello = "Hello World!";
		
		main.writeFile(hello + " " + time);
		
		return hello + " " + time + " " + Thread.currentThread().getName();
	}
}
