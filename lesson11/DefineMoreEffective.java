public class DefineMoreEffective {

	public static void main(String[] args) {
		String experiment = "aaabbbccc";
		
		long currentTime = System.currentTimeMillis();
		String final1 = null;
		for(int i = 0; i < 1000000; i++) {
			final1 = final1 + experiment;
		}
		long finishTime1 = (System.currentTimeMillis() - currentTime);
		
		currentTime = System.currentTimeMillis();
		StringBuilder final2 = new StringBuilder();
		for(int i = 0; i < 1000000; i++) {
			final2.append(experiment);
		}
		long finishTime2 = (System.currentTimeMillis() - currentTime);
		
		System.out.println("Time for concat operation: " + finishTime1 + " миллисекунд");
		System.out.println("Time for stringbuider operation: " + finishTime2 + " миллисекунд");
	}
}
