import java.util.HashSet;
import java.util.Set;

public class BoxesWarehouse {

	public static void main(String[] args) {
		HeavyBoxServiceImpl worker = new HeavyBoxServiceImpl();
		
		Set<HeavyBox> heavySet = new HashSet<>();
		
		HeavyBox heavyBox1 = worker.newHeavyBox(17, 130);
		HeavyBox heavyBox2 = worker.newHeavyBox(14, 150);
		HeavyBox heavyBox3 = worker.newHeavyBox(18, 170);
		HeavyBox heavyBox4 = worker.newHeavyBox(20, 450);
		HeavyBox heavyBox5 = worker.newHeavyBox(10, 145);
		
		worker.addBox(heavySet, heavyBox1);
		worker.addBox(heavySet, heavyBox2);
		worker.addBox(heavySet, heavyBox3);
		worker.addBox(heavySet, heavyBox4);
		worker.addBox(heavySet, heavyBox5);
		
		worker.printBoxesSet(heavySet);
		worker.changeBoxesWeight(heavySet);
		worker.removeBoxes(heavySet);
		worker.heavySetToHeavyArr1(heavySet);
		worker.heavySetToHeavyArr2(heavySet);
		worker.heavySetToHeavyArr3(heavySet);
		worker.removeAllBoxes(heavySet);
	}
}
