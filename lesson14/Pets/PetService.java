import java.util.Map;

public interface PetService {
	public Cat newCat(String petName);
	
	public void addCat(Map<String, Pet> zoo, String petName, Cat cat);
	
	public Dog newDog(String petName);
	
	public void addDog(Map<String, Pet> zoo, String petName, Dog dog);
	
	public Parrot newParrot(String petName);
	
	public void addParrot(Map<String, Pet> zoo, String petName, Parrot parrot);
	
	public void printZoo(Map<String, Pet> zoo);
	
	public void printZooKeys(Map<String, Pet> zoo);
}
