import java.util.*;
import java.util.ArrayList;

public class ex9 {

	public static void main(String[] args) {
		ArrayList<String> wordsArrayList = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		// String []dict=new String[5];

		System.out.print("Enter the words:");
		String word = s.nextLine();
		wordsArrayList.add(word);

		while (!word.equalsIgnoreCase("done")) {
			word = s.nextLine();
			if (!word.equalsIgnoreCase("done"))
				wordsArrayList.add(word);
		}
		s.close();
		System.out.println("Longest words of those inputed are: " + longestWords(wordsArrayList));

	}

	public static ArrayList<String> longestWords(ArrayList<String> ListofWords) {

		ArrayList<String> list = new ArrayList<String>();

		int longest_length = 0;

		for (String LoopVar : ListofWords) {
			int length = LoopVar.length();

			if (length > longest_length) {
				longest_length = length;
				list.clear();
			}

			if (length == longest_length) {
				list.add(LoopVar);
			}
		}

		return list;
	}
}