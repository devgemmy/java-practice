
public class question5 {

    public static void main(String[] args) {

        int[][] numArray = new int[3][10];

        for (int i = 0; i < numArray.length; i++) {
            for (int j = 0; j < numArray[1].length; j++) {
                if (i == 0) {
                    numArray[i][j] = (j + 1) * (j + 1);
                }
                if (i == 1) {
                    numArray[i][j] = 25 * (j + 1);
                } else if (i == 2) {
                    numArray[i][j] = 5000;
                }
            }
        }

        PrintArray(numArray);

    }

    private static void PrintArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
