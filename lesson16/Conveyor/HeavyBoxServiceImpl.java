import java.util.Set;

public class HeavyBoxServiceImpl implements HeavyBoxService {

	@Override
	public HeavyBox newBox() {
		return new HeavyBox();
	}

	@Override
	public void addBox(Set<HeavyBox> boxes, HeavyBox box) {
		boxes.add(box);
		
	}

	@Override
	public void viewBoxes(Set<HeavyBox> boxes) {
		for(HeavyBox box : boxes) {
			System.out.println("Box weight: " + box.getWeight() + " kg" + " | Box size: " + box.getSize() + " m3");
		}
	}
}
