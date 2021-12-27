import java.util.List;

public class StudentsServicesImpl implements StudentsServices {

	@Override
	public Student newStudent(String name, int group, int studyYear) {
		return new Student(name, group, studyYear);
	}

	@Override
	public void addStudent(List<Student> students, Student student) {
		students.add(student);
		
	}

	@Override
	public void printStudents(List<Student> students) {
		for(Student student : students) {
			System.out.println("Student " + student.getName() + " of group " + student.getGroup());
		}
	}

	@Override
	public void sortStudents(List<Student> students) {
		Student currentStudent;
		for(int i = 0; i < students.size(); i++) {
			for(int j = 1; j < students.size(); j++) {
				if(students.get(j).compareTo(students.get(j - 1)) > 0 ) {
					currentStudent = students.get(j - 1);
					students.remove(j - 1);
					students.add(j, currentStudent);
					--i;
				}
			}
		}
	}
}
