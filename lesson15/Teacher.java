import java.util.ArrayList;
import java.util.List;

public class Teacher {

	public static void main(String[] args) {
		StudentsServicesImpl teacher = new StudentsServicesImpl();
		List<Student> students = new ArrayList<>();
		
		teacher.addStudent(students, teacher.newStudent("NEO", 1, 3));
		teacher.addStudent(students, teacher.newStudent("Superman",1 , 3));
		teacher.addStudent(students, teacher.newStudent("Spider man", 2, 3));
		teacher.addStudent(students, teacher.newStudent("Batman", 2, 3));
		teacher.addStudent(students, teacher.newStudent("Terminator T-850", 3, 3));
		
		teacher.sortStudents(students);
		teacher.printStudents(students);
	}
}
