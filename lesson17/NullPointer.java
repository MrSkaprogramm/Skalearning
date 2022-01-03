public class NullPointer {

	public static void main(String[] args) {
		NullPointer nullThere = new NullPointer();
		
		try {
			if(nullThere.nullException().equals("notNull")) {
				System.out.println("All good");
			}
		}catch(NullPointerException exception) {
			exception.printStackTrace();
			System.out.println("Reason for exception is: \n" + exception.getMessage());
		}
	}
	
	public String nullException() {
		String ifNull = null;
		return ifNull;
	}
}
