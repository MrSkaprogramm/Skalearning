public class Childrens extends Thread {
	GoToBed goodNight;
	
	public Childrens(GoToBed goToBed) {
		goodNight = goToBed;
	}
	
	@Override
	public void run() {
		goodNight.pillow();
	}
}
