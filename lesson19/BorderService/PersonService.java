import java.util.List;

public interface PersonService {
	public Person newPerson();
	
	public List<Person> generateGroupPersons();
	
	public void checkPassports(List<Person> persons);
}
