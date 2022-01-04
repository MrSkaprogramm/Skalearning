public class UpstairsException {

	public static void main(String[] args) {
		UpstairsException newException = new UpstairsException();
		
		try {
			newException.upException();
		}catch(NullPointerException exception){
			exception.printStackTrace();
			System.out.println("Exception catched successfully");
		}
	}

	public void upException() throws NullPointerException {
		String text = null;
		System.out.println(text.equals("Hello World!"));
	}
}
