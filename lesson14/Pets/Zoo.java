import java.util.HashMap;
import java.util.Map;

public class Zoo {

	public static void main(String[] args) {
		PetServiceImpl homeAnimals = new PetServiceImpl();
		Map<String, Pet> zoo = new HashMap<>();
		
		homeAnimals.addCat(zoo, "Garfield", homeAnimals.newCat("Garfield"));
		homeAnimals.addCat(zoo, "Barsik", homeAnimals.newCat("Barsik"));
		homeAnimals.addCat(zoo, "Fred", homeAnimals.newCat("Fred"));
		homeAnimals.addDog(zoo, "Bobby", homeAnimals.newDog("Bobby"));
		homeAnimals.addDog(zoo, "Xavier", homeAnimals.newDog("Xavier"));
		homeAnimals.addDog(zoo, "Tide", homeAnimals.newDog("Tide"));
		homeAnimals.addParrot(zoo, "Kuku", homeAnimals.newParrot("Kuku"));
		homeAnimals.addParrot(zoo, "Krack", homeAnimals.newParrot("Krack"));
		homeAnimals.addParrot(zoo, "Oliver", homeAnimals.newParrot("Oliver"));

		homeAnimals.printZoo(zoo);
		homeAnimals.printZooKeys(zoo);
	}
}
