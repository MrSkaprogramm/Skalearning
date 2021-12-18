public class Car<T extends Engine> {
	private T engine;
	
	public Car(T engine) {
		this.engine = engine;
	}
	
	public T getEngine() {
		return engine;
	}
	
	public void setEngine(T engine) {
		this.engine = engine;
	}
}
