public class StudentAnalysisPractical extends Students {
	
	public StudentAnalysisPractical(int StandartLearningTime) {
		super(StandartLearningTime);
		this.learn = new StudentAnalysisPracticalLearning();
	}
}
