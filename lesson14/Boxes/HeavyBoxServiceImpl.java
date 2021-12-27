import java.util.Set;

public class HeavyBoxServiceImpl implements HeavyBoxService {
	
	@Override
	public HeavyBox newHeavyBox(int size, int weight) {
		return new HeavyBox(size, weight);
	}

	@Override
	public void addBox(Set<HeavyBox> heavySet, HeavyBox box) {
		heavySet.add(box);
	}

	@Override
	public void printBoxesSet(Set<HeavyBox> heavySet) {
		System.out.println("Boxes in collection:");
		for(HeavyBox currentBox : heavySet) {
			System.out.println("Box size is: " + currentBox.getSize() + "m3; box weight is:" + currentBox.getWeight() + " kg");
		}
		System.out.println("----------------");	
	}

	@Override
	public void printBoxesArr(HeavyBox[] heavyArr) {
		System.out.println("Boxes in array:");
		for(HeavyBox currentBox : heavyArr) {
			System.out.println("Box size is: " + currentBox.getSize() + "m3; box weight is:" + currentBox.getWeight() + " kg");
		}
		System.out.println("----------------");	
	}

	@Override
	public void changeBoxesWeight(Set<HeavyBox> heavySet) {
		heavySet.stream().findFirst().get().setWeight(131);
		System.out.println("- Weight of first box changed to 131 kg -");
	}

	@Override
	public void removeBoxes(Set<HeavyBox> heavySet, HeavyBox heavyBox) {
		heavySet.remove(heavyBox);
		System.out.println("- Box removed from warehouse -");
	}

	@Override
	public void removeAllBoxes(Set<HeavyBox> heavySet) {
		heavySet.clear();
		System.out.println("- All boxes removed from warehouse -");
	}

	@Override
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

	@Override
	public void heavySetToHeavyArr2(Set<HeavyBox> heavySet) {
		System.out.println("Transfering boxes to array by second method...");
		HeavyBox[] heavyArr = new HeavyBox[heavySet.size()];
		
		System.arraycopy(heavySet.toArray(), 0, heavyArr, 0, heavySet.size());;
		
		printBoxesArr(heavyArr);	
	}

	@Override
	public void heavySetToHeavyArr3(Set<HeavyBox> heavySet) {
		System.out.println("Transfering boxes to array by third method...");
		HeavyBox[] heavyArr = new HeavyBox[heavySet.size()];
		
		heavyArr = heavySet.toArray(heavyArr);
		
		printBoxesArr(heavyArr);	
	}
}
