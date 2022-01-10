import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable{
	private static final long serialVersionUID = -9021233968776096557L;
	private static final int AVERAGE_LIFETIME = 90;
	private String name;
	private String surname;
	private int age;
	
	public Person() {
		this.name = generateRandomWord();
		this.surname = generateRandomWord();
		this.age = (int)(Math.random()*AVERAGE_LIFETIME);
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
}
