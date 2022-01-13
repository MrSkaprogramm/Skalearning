import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonServiceImpl implements PersonService {
	private static final int AMOUNT_PERSONS = 100;
	
	@Override
	public Person newPerson() {
		return new Person();
	}
	@Override
	public List<Person> generateGroupPersons() {
		return Stream.generate(() -> new Person())
			.limit(AMOUNT_PERSONS)
			.toList();
		
	}
	@Override
	public void checkPassports(List<Person> persons) {
		Comparator<Person> sortPersons = Comparator
								.comparing(Person::getSurname)
								.thenComparing(Person::getName);
		persons.stream()
			.filter(person -> person.getAge() < 21)
			.peek(person -> System.out.println("Person under 21: " + person.getName()))
			.sorted(sortPersons)
			.limit(4).collect(Collectors.toList()).forEach(person -> System.out.print("Person with suspicious passport: " + "name: " 
																						+ person.getName() + " surname: " + person.getSurname() 
																						+  " age: " +  person.getAge() + "\n"));
	}
}
