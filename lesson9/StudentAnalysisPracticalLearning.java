public class StudentAnalysisPracticalLearning implements Learning {
	@Override
	public void learning(int StandartLearningTime, double talent, int totalLearningTime, int practiceTime, int analysisTime, int flowTime) {
		totalLearningTime = (int) ((StandartLearningTime*2)/talent);
		practiceTime = totalLearningTime/2;
		analysisTime = totalLearningTime/2;
		System.out.println("Student type 2");
		System.out.println("Student's analysis time is: " + analysisTime + "hours");
		System.out.println("Student's practice time is: " + practiceTime + "hours");
		System.out.println("Student talent is: " + talent);
		System.out.println("Total student's learning time is: " + totalLearningTime + "hours");
		System.out.println();
	}
}
