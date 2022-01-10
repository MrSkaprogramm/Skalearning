import java.io.File;
import java.util.List;

public interface PersonService {
	public Person createNewPerson();
	
	public File createListFile();
	
	public void addPersonToList(List<Person> persons, Person person);
	
	public void createFilePersons(File file, List<Person> persons);
	
	public void readPersonFile(File file, int amountPersons);
}
