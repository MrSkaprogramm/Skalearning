import java.util.Comparator;

public class SortCustomers implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		if(!o1.equals(o2)) {
			return o1.compareTo(o2);
		}
		return 0;
	}
}
