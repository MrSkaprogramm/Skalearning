public class StudentGrades {

	public static void main(String[] args) {
		List<Integer> grades = new ArrayList<>();
		
		for(int i = 0; i < 100; i++) {
			grades.add((int)(Math.random()*10 + 1));
		}
		System.out.print("All student grades:");
		for(int i = 0; i < grades.size(); i++) {
				System.out.print(grades.get(i) + " ");
		}
		System.out.println();
		for(int i = 0; i < grades.size(); i++) {
			if(grades.get(i) < 7) {
				grades.remove(i);
				i--;
			}
		}
		System.out.print("All  good student grades:");
		for(int i = 0; i < grades.size(); i++) {
			System.out.print(grades.get(i) + " ");
		}	
	}
}
