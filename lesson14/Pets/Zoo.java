import java.util.HashMap;
import java.util.Map;

public class Zoo {

	public static void main(String[] args) {
		Zoo homeAnimals = new Zoo();
		Map<String, Pet> zoo = new HashMap<>();
		
		Cat cat1 = new Cat("Garfield");
		Cat cat2 = new Cat("Barsik");
		Cat cat3 = new Cat("Fred");
		Dog dog1 = new Dog("Bobby");
		Dog dog2 = new Dog("Xavier");
		Dog dog3 = new Dog("Tide");
		Parrot parrot1 = new Parrot("Kuku");
		Parrot parrot2 = new Parrot("Krack");
		Parrot parrot3 = new Parrot("Oliver");
		
		zoo.put(cat1.getCatName(), cat1);
		zoo.put(cat2.getCatName(), cat2);
		zoo.put(cat3.getCatName(), cat3);
		zoo.put(dog1.getDogName(), dog1);
		zoo.put(dog2.getDogName(), dog2);
		zoo.put(dog3.getDogName(), dog3);
		zoo.put(parrot1.getParrotName(), parrot1);
		zoo.put(parrot2.getParrotName(), parrot2);
		zoo.put(parrot3.getParrotName(), parrot3);
		
		homeAnimals.printZoo(zoo);
		homeAnimals.printZooKeys(zoo);
		
	}
	
	public void printZoo(Map<String, Pet> zoo) {
		for(Map.Entry<String, Pet> currentPet : zoo.entrySet()) {
			System.out.println("Pet name: " + currentPet.getKey() + " | Type of pet: " + currentPet.getValue().getClass());
		}
	}
	
	public void printZooKeys(Map<String, Pet> zoo) {
		for(String currentPet : zoo.keySet()) {
			System.out.println("Pet name: " + currentPet);
		}
	}

}
