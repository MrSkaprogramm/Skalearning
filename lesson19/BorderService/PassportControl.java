import java.util.List;

public class PassportControl {

	public static void main(String[] args) {
		PersonServiceImpl passportControl = new PersonServiceImpl();
		
		List<Person> persons = passportControl.generateGroupPersons();
		passportControl.checkPassports(persons);
	}
}
