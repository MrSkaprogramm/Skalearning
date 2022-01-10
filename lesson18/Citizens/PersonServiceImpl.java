import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class PersonServiceImpl implements PersonService {

	@Override
	public Person createNewPerson() {
		return new Person();
	}

	@Override
	public void addPersonToList(List<Person> persons, Person person) {
		persons.add(person);
	}
	
	public void createFilePersons(File file, List<Person> persons) {
		try {
			FileOutputStream addPerson = new FileOutputStream(file);
			ObjectOutputStream addPersonObj = new ObjectOutputStream(addPerson);
			for(int i = 0; i < persons.size(); i++) {
				addPersonObj.writeObject(persons.get(i));
			}
			addPerson.close();
			addPersonObj.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void readPersonFile(File file, int amountPersons) {
		try {
			FileInputStream readPerson = new FileInputStream(file);
			ObjectInputStream readPersonObj = new ObjectInputStream(readPerson);
			for(int i = 0; i < amountPersons; i++) {
				Person person = (Person)readPersonObj.readObject();
				System.out.printf("Person name: %s, Person surname: %s, Person age: %d\n", person.getName(), person.getSurname(), person.getAge());
			}
			readPerson.close();
			readPersonObj.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public File createListFile() {
		File file = new File("Citizens.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return file;
	}
}
