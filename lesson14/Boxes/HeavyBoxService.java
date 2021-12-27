import java.util.Set;

public interface HeavyBoxService {
	public HeavyBox newHeavyBox(int size, int weight);
	
	public void addBox(Set<HeavyBox> heavySet, HeavyBox box);
	
	public void printBoxesSet(Set<HeavyBox> heavySet);
	
	public void printBoxesArr(HeavyBox[] heavyArr);
	
	public void changeBoxesWeight(Set<HeavyBox> heavySet);
	
	public void removeBoxes(Set<HeavyBox> heavySet, HeavyBox heavyBox);
	
	public void removeAllBoxes(Set<HeavyBox> heavySet);
	
	public void heavySetToHeavyArr1(Set<HeavyBox> heavySet);
	
	public void heavySetToHeavyArr2(Set<HeavyBox> heavySet);
	
	public void heavySetToHeavyArr3(Set<HeavyBox> heavySet);
}
