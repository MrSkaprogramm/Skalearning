import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Accountant {

	public static void main(String[] args) {
		ProductServiceImpl accountant = new ProductServiceImpl();
		Map<String, Map<String, Integer>> dataMap = new HashMap<>();
		List<Product> products = new ArrayList<>();
		
		accountant.addData(dataMap, products);
		accountant.viewData(dataMap);
	}
}
