import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BiggestGrade {

	public static void main(String[] args) {
		List<Integer> grades = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			grades.add((int)(Math.random()*10 + 1));
		}
		System.out.print("All student grades:");
		for(int i = 0; i < grades.size(); i++) {
				System.out.print(grades.get(i) + " ");
		}
		Integer maxGrade = grades.get(0);
		
		Iterator<Integer> iterator = grades.iterator();
		
		while(iterator.hasNext()) {
			int grade = iterator.next();
			if(grade > maxGrade) {
				maxGrade = grade;
			}
		}
		System.out.print("The best student grade: " + maxGrade);
	}
}
