
public class ex3 {

	public static void main(String[] args) {

		int myarray[][] = new int[3][10];

		for (int i = 0; i < myarray[0].length; i++) {
			myarray[0][i] = (i + 1) * 25;
			myarray[1][i] = (i + 1) * 25;
			myarray[2][i] = 5000;
		}
		printArray(myarray);

	}

	private static void printArray(int[][] array) {
		for (int i = 0; i < array.length; ++i) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
