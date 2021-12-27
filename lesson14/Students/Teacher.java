import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teacher {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		StudentServiceImpl teacher = new StudentServiceImpl();
		
		List<StudentLearn> students = new ArrayList<>();
		
		teacher.addStudent(students, teacher.newStudent("Donald duck", "1B", 3));
		teacher.addStudent(students, teacher.newStudent("Fiona", "2A", 3));
		teacher.addStudent(students, teacher.newStudent("Shrek", "2A", 3));
		teacher.addStudent(students, teacher.newStudent("Torreto", "1A", 2));
		teacher.addStudent(students, teacher.newStudent("Mr.Bond", "1A", 1));
		
		teacher.deleteBadStudents(students);
		System.out.println("Students of which study year you want to see?");
		int studyYear = sc.nextInt();
		teacher.printStudents(students, studyYear);
	}
}
