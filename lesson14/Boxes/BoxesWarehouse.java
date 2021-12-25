import java.util.HashSet;
import java.util.Set;

public class BoxesWarehouse {

	public static void main(String[] args) {
		BoxesWarehouse worker = new BoxesWarehouse();
		
		Set<HeavyBox> heavySet = new HashSet<>();
		HeavyBox heavyBox1 = new HeavyBox(17, 130);
		HeavyBox heavyBox2 = new HeavyBox(17, 130);
		HeavyBox heavyBox3 = new HeavyBox(17, 130);
		HeavyBox heavyBox4 = new HeavyBox(17, 130);
		HeavyBox heavyBox5 = new HeavyBox(17, 130);
		
		heavySet.add(heavyBox1);
		heavySet.add(heavyBox2);
		heavySet.add(heavyBox3);
		heavySet.add(heavyBox4);
		heavySet.add(heavyBox5);
		
		worker.printBoxesSet(heavySet);
		worker.changeBoxesWeight(heavySet);
		worker.removeBoxes(heavySet, heavyBox4);
		worker.heavySetToHeavyArr1(heavySet);
		worker.heavySetToHeavyArr2(heavySet);
		worker.heavySetToHeavyArr3(heavySet);
		worker.removeAllBoxes(heavySet);
	}
	
	public void printBoxesSet(Set<HeavyBox> heavySet) {
		System.out.println("Boxes in collection:");
		for(HeavyBox currentBox : heavySet) {
			System.out.println("Box size is: " + currentBox.getSize() + "m3; box weight is:" + currentBox.getWeight() + " kg");
		}
		System.out.println("----------------");
	}
	
	public void printBoxesArr(HeavyBox[] heavyArr) {
		System.out.println("Boxes in array:");
		for(HeavyBox currentBox : heavyArr) {
			System.out.println("Box size is: " + currentBox.getSize() + "m3; box weight is:" + currentBox.getWeight() + " kg");
		}
		System.out.println("----------------");
	}
	
	public void changeBoxesWeight(Set<HeavyBox> heavySet) {
		heavySet.stream().findFirst().get().setWeight(131);
		System.out.println("- Weight of first box changed to 131 kg -");
	}
	
	public void removeBoxes(Set<HeavyBox> heavySet, HeavyBox heavyBox) {
		heavySet.remove(heavyBox);
		System.out.println("- Box removed from warehouse -");
	}
	
	public void removeAllBoxes(Set<HeavyBox> heavySet) {
		heavySet.clear();
		System.out.println("- All boxes removed from warehouse -");
	}
	
	public void heavySetToHeavyArr1(Set<HeavyBox> heavySet) {
		System.out.println("Transfering boxes to array by first method...");
		HeavyBox[] heavyArr = new HeavyBox[heavySet.size()];
		
		int i = 0;
		for(HeavyBox box : heavySet) {
			heavyArr[i] = box;
			i++;
		}
		
		printBoxesArr(heavyArr);
	}
	
	public void heavySetToHeavyArr2(Set<HeavyBox> heavySet) {
		System.out.println("Transfering boxes to array by second method...");
		HeavyBox[] heavyArr = new HeavyBox[heavySet.size()];
		
		System.arraycopy(heavySet.toArray(), 0, heavyArr, 0, heavySet.size());;
		
		printBoxesArr(heavyArr);
	}
	
	public void heavySetToHeavyArr3(Set<HeavyBox> heavySet) {
		System.out.println("Transfering boxes to array by third method...");
		HeavyBox[] heavyArr = new HeavyBox[heavySet.size()];
		
		heavyArr = heavySet.toArray(heavyArr);
		
		printBoxesArr(heavyArr);
	}
}
