public class StudentAnalysisPracticalFlow extends Students {
	
	public StudentAnalysisPracticalFlow(int StandartLearningTime) {
		super(StandartLearningTime);
		this.learn = new StudentAnalysisPracticalFlowLearning();
	}
}
