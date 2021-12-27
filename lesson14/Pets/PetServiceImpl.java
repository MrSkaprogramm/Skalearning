import java.util.Map;

public class PetServiceImpl implements PetService {

	@Override
	public Cat newCat(String petName) {
		return new Cat(petName);
	}

	@Override
	public void addCat(Map<String, Pet> zoo, String petName, Cat cat) {
		zoo.put(petName, cat);
	}

	@Override
	public Dog newDog(String petName) {
		return new Dog(petName);
	}

	@Override
	public void addDog(Map<String, Pet> zoo, String petName, Dog dog) {
		zoo.put(petName, dog);
		
	}

	@Override
	public Parrot newParrot(String petName) {
		return new Parrot(petName);
	}

	@Override
	public void addParrot(Map<String, Pet> zoo, String petName, Parrot parrot) {
		zoo.put(petName, parrot);
	}

	@Override
	public void printZoo(Map<String, Pet> zoo) {
		for(Map.Entry<String, Pet> currentPet : zoo.entrySet()) {
			System.out.println("Pet name: " + currentPet.getKey() + " | Type of pet: " + currentPet.getValue().getClass());
		}
	}

	@Override
	public void printZooKeys(Map<String, Pet> zoo) {
		for(String currentPet : zoo.keySet()) {
			System.out.println("Pet name: " + currentPet);
		}
	}
}
