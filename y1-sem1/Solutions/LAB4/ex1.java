public class ex1 {

	public static void main(String[] args) {

		double[] heights = { 187.5, 165, 191, 156, 172.4, 175, 169, 159.8, 184, 174.2 };
		// part a
		System.out.println(heights.length);

		// part b
		for (int i = 0; i < heights.length; i++) {
			System.out.print(heights[i] + ",");
		}

		System.out.println();

		// part c
		double av = 0;

		for (int i = 0; i < heights.length; i++) {
			av += heights[i];
		}
		System.out.println(av / 10);

		// part d

		double min = heights[0];
		double max = heights[0];
		for (int i = 1; i < heights.length; i++) {
			if (min > heights[i]) {
				min = heights[i];
			}

			if (max < heights[i]) {
				max = heights[i];
			}
		}

		System.out.println(min);
		System.out.println(max);

	}
}
