public class StudentPractical extends Students {
	
	public StudentPractical(int StandartLearningTime) {
		super(StandartLearningTime);
		this.learn = new StudentsPracticalLearning();
	}
}
