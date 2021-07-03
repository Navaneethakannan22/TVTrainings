import java.util.ArrayList;
import java.util.List;

public class FruitsSegregation {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		List<String> apple = new ArrayList<>();
		List<String> banana = new ArrayList<>();
		List<String> orange = new ArrayList<>();

		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("orange");
		fruits.add("pineapple");
		fruits.add("Banana");
		fruits.add("orange");
		fruits.add("jackfruit");

		for (String fruit : fruits) {
			if (fruit.equalsIgnoreCase("apple")) {
				apple.add(fruit);
			} else if (fruit.equalsIgnoreCase("banana")) {
				banana.add(fruit);
			} else if (fruit.equalsIgnoreCase("orange")) {
				orange.add(fruit);
			}
		}

		System.out.println("There are '" + apple.size() + "' apples in fruits bowl");
		System.out.println("There are '" + banana.size() + "' bananas in fruits bowl");
		System.out.println("There are '" + orange.size() + "' oranges in fruits bowl");
	}

}
