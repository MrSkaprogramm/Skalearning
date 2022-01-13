import java.util.Comparator;
import java.util.Objects;
import java.util.Random;

public class Person implements Comparator<Person> {
	private String name;
	private String surname;
	private int age;
	private static final int MIN_AGE = 15;
	private static final int MAX_AGE = 30;
	
	public Person() {
		this.name = generateRandomWord();
		this.surname = generateRandomWord();
		this.age = new Random().ints(1, MIN_AGE, MAX_AGE).findFirst().getAsInt();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name, surname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name) && Objects.equals(surname, other.surname);
	}
	
	public String generateRandomWord() {
		String letters = "abcdefghijklmnopqrstuvwxyz"; 
	
		char[] randomWord = new char[(int)(Math.random()*10 + 1)];
		for(int i = 0; i < randomWord.length; i++) {
			randomWord[i] = letters.charAt((int)(Math.random()*letters.length()));
		}
		randomWord[0] = Character.toUpperCase(randomWord[0]);
		return new String(randomWord);
	}

	@Override
	public int compare(Person o1, Person o2) {
		if (o1.getSurname().compareTo(o2.getSurname())==0) {
            return o1.getName().compareTo(o2.getName());
       }else 
       		return o1.getSurname().compareTo(o2.getSurname());
	}
}
