import java.text.DecimalFormat;

public class Exercise3 {

    public static void main(String[] args) {
        System.out.println("Lab 4 - Exercise 3 \n");

        int[][] myarray = new int[3][10];

        for (int i = 0; i < myarray.length; i++) {
            for (int j = 0; j < myarray[1].length; j++) {
                if (i == 0 || i == 1) {
                    myarray[i][j] = 25 * (j + 1);
                } else {
                    myarray[i][j] = 5000;
                }
            }

        }

        PrintArray(myarray);

        double number = 1.0 / 3.0;
        System.out.println(number);

        DecimalFormat numFormat = new DecimalFormat("#.####");
        String formatted_string = numFormat.format(number);
        System.out.println(formatted_string);

    }

    private static void PrintArray(int[][] array) {
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
