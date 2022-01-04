import java.util.Set;

public interface HeavyBoxService {
	public HeavyBox newBox();
	
	public void addBox(Set<HeavyBox> boxes, HeavyBox box);
	
	public void viewBoxes(Set<HeavyBox> boxes);
}
