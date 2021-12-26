import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Teacher {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		
		List<Students> students = new ArrayList<>();
		
		Students student1 = new Students("Donald duck", "1B", 3);
		Students student2 = new Students("Fiona", "2A", 3);
		Students student3 = new Students("Shrek", "2A", 3);
		Students student4 = new Students("Torreto", "1A", 2);
		Students student5 = new Students("Mr.Bond", "1A", 1);
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		
		teacher.deleteBadStudents(students);
		System.out.println("Students of which study year you want to see?");
		int studyYear = sc.nextInt();
		teacher.printStudents(students, studyYear);
	}
	
	public void deleteBadStudents(List<Students> students) {
		int totalRating = 0;
		Iterator<Students> iterator = students.iterator();
		
		int i = 0;
		while(i < students.size()) {
			i++;
			Students teacher = iterator.next();
			for(Integer viewRatings : teacher.getAssestments().values()) {
				totalRating += viewRatings;
			}
			if(totalRating / teacher.getAssestments().size() < 3) {
				students.remove(teacher);
				i--;
			}else {
				teacher.setStudyYear(teacher.getStudyYear() + 1);
			}
			totalRating = 0;
		}
	}
	
	public void printStudents(List<Students> students, int studyYear) {
		boolean isLearn = false;
		for(int i = 0; i < students.size(); i++) {
			if(isLearn == false && students.get(i).getStudyYear() == studyYear) {
				System.out.println("On this study year learns:");
			}
			if(students.get(i).getStudyYear() == studyYear) {
				System.out.println(students.get(i).getName());
				isLearn = true;
			}
		}
		if(isLearn == false) {
			System.out.println("There is no students, who learns on this study year");
		}
	}
}
