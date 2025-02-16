import java.util.ArrayList;

public class ArrayListsExs {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		// ArrayList<Double> heights = new ArrayList<Double>();

		names.add("Chimsonari");
		names.add("Chizitelu");
		names.add("Nenuphar");
		names.add("Jonquille");
		System.out.println(names);

		names.set(1, "Chikamharida");
		System.out.println(names);

		for (int v = 0; v < names.size(); v++) {
			System.out.println(v + 1 + ". " + names.get(v));
		}
		names.remove(0);
		System.out.println(names);

		System.out.println(names.indexOf("Jonquille"));

		names.clear();

		// ============================================================
		// Array

		int[] bubbleList = { 4, 46, 23, 8, 90, 11, 21, 65, 49, 3, 37 };

		int x = bubbleList[0];
		for (int p = 1; p < bubbleList.length; p++) {

			if (bubbleList[p] < x)
				x = bubbleList[p];
		}
		System.out.println(x + " is the smallest number in the list");

		// ArrayList
		ArrayList<Integer> minBubble = new ArrayList<Integer>();

		minBubble.add(42);
		minBubble.add(46);
		minBubble.add(23);
		minBubble.add(8);
		minBubble.add(90);
		minBubble.add(11);
		minBubble.add(21);
		minBubble.add(65);
		minBubble.add(49);
		minBubble.add(13);
		minBubble.add(37);

		int c = minBubble.get(0);
		for (int f = 0; f < minBubble.size(); f++) {
			if (minBubble.get(f) < c)
				c = minBubble.get(f);
		}

		System.out.println(c + " is the new smallest number in the list");
	}

}
