import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Citizens {

	public static void main(String[] args) {
		PersonServiceImpl bigCity = new PersonServiceImpl();
		List<Person> persons = new ArrayList<>();
		
		File file = bigCity.createListFile();
		bigCity.addPersonToList(persons, bigCity.createNewPerson());
		bigCity.addPersonToList(persons, bigCity.createNewPerson());
		bigCity.addPersonToList(persons, bigCity.createNewPerson());
		bigCity.addPersonToList(persons, bigCity.createNewPerson());
		bigCity.addPersonToList(persons, bigCity.createNewPerson());
		bigCity.addPersonToList(persons, bigCity.createNewPerson());
		bigCity.addPersonToList(persons, bigCity.createNewPerson());
		bigCity.addPersonToList(persons, bigCity.createNewPerson());
		bigCity.addPersonToList(persons, bigCity.createNewPerson());
		bigCity.addPersonToList(persons, bigCity.createNewPerson());
		
		bigCity.createFilePersons(file, persons);
		bigCity.readPersonFile(file, persons.size());
	}
}
