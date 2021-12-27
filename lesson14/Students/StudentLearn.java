import java.util.HashMap;
import java.util.Map;

public class StudentLearn {
	private String name;
	private String group;
	private int studyYear;
	private Map<String, Integer> assestments;
	
	public StudentLearn(String name,  String group, int studyYear) {
		this.name = name;
		this.group = group;
		this.studyYear = studyYear;
		this.assestments = rateStudent(assestments);
	}

	public Map<String, Integer> rateStudent(Map<String, Integer> assestments) {
		assestments = new HashMap<>();
		
		assestments.put("Math", (int)(Math.random()*10 + 1));
		assestments.put("System administrating", (int)(Math.random()*10 + 1));
		assestments.put("Physics", (int)(Math.random()*10 + 1));
		assestments.put("C++", (int)(Math.random()*10 + 1));
		assestments.put("Java", (int)(Math.random()*10 + 1));
		return assestments;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGroup() {
		return group;
	}
	
	public void setGroup(String group) {
		this.group = group;
	}
	
	public int getStudyYear() {
		return studyYear;
	}
	
	public void setStudyYear(int studyYear) {
		this.studyYear = studyYear;
	}
	
	public Map<String, Integer> getAssestments() {
		return assestments;
	}
	
	public void setAssestments(Map<String, Integer> assestments) {
		this.assestments = assestments;
	}
}
