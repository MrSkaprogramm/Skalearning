public class StudentsPracticalLearning implements Learning {
	@Override
	public void learning(int StandartLearningTime, double talent, int totalLearningTime, int practiceTime, int analysisTime, int flowTime) {
		totalLearningTime = (int) ((StandartLearningTime*3)/talent);
		practiceTime = totalLearningTime;
		System.out.println("Student type 3");
		System.out.println("Student's practice time is: " + practiceTime + "hours");
		System.out.println("Student talent is: " + talent);
		System.out.println("Total student's learning time is: " + totalLearningTime + "hours");
		System.out.println();
	}
}
