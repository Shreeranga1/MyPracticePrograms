package Practice;
import java.util.ArrayList;
import java.util.List;

public class DuplicatesAndCount {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("banana");
		fruits.add("orange");
		fruits.add("grapes");
		ArrayList<Integer> results = new ArrayList<>();

		for (String s : fruits) {
			results.add(getcount(s, fruits));
		}

		ArrayList<String> finalResult = new ArrayList<>();

		for (int i = 0; i < fruits.size(); i++) {
			finalResult.add("element--" + fruits.stream().toArray()[i] + "  repeated " + results.stream().toArray()[i]
					+ " Times");
		}

		finalResult.stream().distinct().forEach(x -> System.out.println(x));

	}

	public static int getcount(String element, List<String> e) {
		int count = 0;
		for (int i = 0; i < e.size(); i++) {
			if (e.toArray()[i] == element) {
				count++;
			}
		}
		return count;
	}
}
