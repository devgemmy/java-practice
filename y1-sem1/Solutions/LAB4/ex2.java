import java.util.ArrayList;

public class ex2 {

	public static void main(String[] args) {

		ArrayList<Double> heightsList = new ArrayList<Double>();
		heightsList.add(172.0);
		heightsList.add(192.0);
		heightsList.add(156.0);
		heightsList.add(175.0);
		heightsList.add(186.0);
		heightsList.add(184.0);
		heightsList.add(159.0);
		heightsList.add(168.0);
		heightsList.add(178.0);
		heightsList.add(164.0);
		// part1
		heightsList.remove(2);
		// part2
		heightsList.add(183.0);
		heightsList.add(167.0);
		heightsList.add(174.5);
		heightsList.add(154.0);
		heightsList.add(166.0);

		// part3

		double sort = 0;
		for (int i = 0; i < heightsList.size(); i++) {
			for (int j = 1; j < heightsList.size(); j++) {
				if (heightsList.get(j - 1) > heightsList.get(j)) {
					sort = heightsList.get(j - 1);
					heightsList.remove(j - 1);
					heightsList.add(j, sort);
				}

			}
		}

		// part4

		System.out.println(heightsList.size());
		System.out.print(heightsList);
		System.out.println();

		// part5.1

		System.out.println(heightsList.get(0));// The list is listed in ascending order thus the first data in array
												// will be the minimum
		// part 5.2
		System.out.print(heightsList.get(13));// the last data in the list is the maximum. the last data is the size-1
												// of the array

	}

}
