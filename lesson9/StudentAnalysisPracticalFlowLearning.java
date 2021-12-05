public class StudentAnalysisPracticalFlowLearning implements Learning {
	@Override
	public void learning(int StandartLearningTime, double talent, int totalLearningTime, int practiceTime, int analysisTime, int flowTime) {
		totalLearningTime = (int) (StandartLearningTime/talent);
		practiceTime = totalLearningTime/3;
		analysisTime = totalLearningTime/3;
		flowTime = totalLearningTime/3;
		System.out.println("Student type 1");
		System.out.println("Student's analysis time is: " + analysisTime + "hours");
		System.out.println("Student's flow time is: " + flowTime + "hours");
		System.out.println("Student's practice time is: " + practiceTime + "hours");
		System.out.println("Student talent is: " + talent);
		System.out.println("Total student's learning time is: " + totalLearningTime + "hours");
		System.out.println();
	}
}
