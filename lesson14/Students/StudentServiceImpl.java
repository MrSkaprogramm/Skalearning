import java.util.Iterator;
import java.util.List;

public class StudentServiceImpl implements StudentService {

	@Override
	public StudentLearn newStudent(String name, String group, int studyYear) {
		return new StudentLearn(name, group, studyYear);
	}

	@Override
	public void addStudent(List<StudentLearn> students, StudentLearn student) {
		students.add(student);
		
	}

	@Override
	public void deleteBadStudents(List<StudentLearn> students) {
		int totalRating = 0;
		Iterator<StudentLearn> iterator = students.iterator();
		
		int i = 0;
		while(i < students.size()) {
			i++;
			StudentLearn teacher = iterator.next();
			for(Integer viewRatings : teacher.getAssestments().values()) {
				totalRating += viewRatings;
			}
			System.out.println("totalRating " + totalRating + " of " + teacher.getName());
			if(totalRating / teacher.getAssestments().size() < 3) {
				students.remove(teacher);
				i--;
			}else {
				teacher.setStudyYear(teacher.getStudyYear() + 1);
			}
			totalRating = 0;
		}
		System.out.println("----------------");
	}

	@Override
	public void printStudents(List<StudentLearn> students, int studyYear) {
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
