import java.util.Scanner;

public class Teacher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a standard indicator of the time of mastering the skill:");
		int StandartLearningTime = sc.nextInt();
		sc.close();
		
		System.out.println("A group of students of type 1 - do the analysis, the practical part and are in the flow");
		System.out.println("First student:");
		Students firstStudent = new StudentAnalysisPracticalFlow(StandartLearningTime);
		firstStudent.letsLearn();
		System.out.println("Second student:");
		Students secondStudent = new StudentAnalysisPracticalFlow(StandartLearningTime);
		secondStudent.letsLearn();
		System.out.println("Third student:");
		Students thirdStudent = new StudentAnalysisPracticalFlow(StandartLearningTime);
		thirdStudent.letsLearn();
		
		System.out.println("A group of students of type 2 - do the analysis and the practical part");
		System.out.println("Forth student");
		Students forthStudent = new StudentAnalysisPractical(StandartLearningTime);
		forthStudent.letsLearn();
		System.out.println("Fifth student:");
		Students fifthStudent = new StudentAnalysisPractical(StandartLearningTime);
		fifthStudent.letsLearn();
		System.out.println("Sixth student:");
		Students sixthStudent = new StudentAnalysisPractical(StandartLearningTime);
		sixthStudent.letsLearn();
		
		System.out.println("A group of students of type 3 - do the practical part");
		System.out.println("Seventh student:");
		Students seventhStudent = new StudentPractical(StandartLearningTime);
		seventhStudent.letsLearn();
		System.out.println("Eigth student:");
		Students eigthStudent = new StudentPractical(StandartLearningTime);
		eigthStudent.letsLearn();
		System.out.println("Nineth student:");
		Students ninethStudent = new StudentPractical(StandartLearningTime);
		ninethStudent.letsLearn();	
	}
}
