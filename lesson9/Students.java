public class Students {
	
	Learning learn;
	private double talent;
	private int StandartLearningTime;
	private int totalLearningTime;
	private int practiceTime;
	private int analysisTime;
	private int flowTime;
	
	public Students(int StandartLearningTime) {
		this.talent = ((double)((int)(Math.random()*10 + 1))) / 10.0;
		this.StandartLearningTime = StandartLearningTime;
	}
	
	public void letsLearn() {
		learn.learning(StandartLearningTime, talent, totalLearningTime, practiceTime, analysisTime, flowTime);
	}
}
