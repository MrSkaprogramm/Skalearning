public class GoToBed {

	public static void main(String[] args) {
		GoToBed goSleep = new GoToBed();
		for(int i = 0; i < 10; i++) {
			Childrens child = new Childrens(goSleep);
			child.start();
		}
	}
	
	public synchronized void pillow() {
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
