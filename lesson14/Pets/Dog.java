public class Dog extends Pet {
	private String dogName;
	
	public Dog(String dogName) {
		this.dogName = dogName;
	}
	
	public String getDogName() {
		return dogName;
	}
	
	public void setDogName(String dogName) {
		this.dogName = dogName;
	}
}
