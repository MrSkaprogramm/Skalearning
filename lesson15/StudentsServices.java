import java.util.List;

public interface StudentsServices {
	
	public Student newStudent(String name, int group, int studyYear);
	
	public void addStudent(List<Student> students, Student student);
	
	public void printStudents(List<Student> students);
	
	public void sortStudents(List<Student> students);
}
