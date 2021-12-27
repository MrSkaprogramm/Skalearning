import java.util.List;

public interface StudentService {
	
	public StudentLearn newStudent(String name, String group, int studyYear);
	
	public void addStudent(List<StudentLearn> students, StudentLearn student);
	
	public void deleteBadStudents(List<StudentLearn> students);
	
	public void printStudents(List<StudentLearn> students, int studyYear);
}
