import java.util.Set;
import java.util.TreeSet;

public class RobotSorter {

	public static void main(String[] args) {
		HeavyBoxServiceImpl sorter = new HeavyBoxServiceImpl();
		Set<HeavyBox> boxes = new TreeSet<HeavyBox>();
		
		sorter.addBox(boxes, sorter.newBox());
		sorter.addBox(boxes, sorter.newBox());
		sorter.addBox(boxes, sorter.newBox());
		sorter.addBox(boxes, sorter.newBox());
		sorter.addBox(boxes, sorter.newBox());
		
		sorter.viewBoxes(boxes);
	}
}
