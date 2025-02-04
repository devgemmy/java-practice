import java.util.Random;
import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        System.out.println("Lab 4 - Exercise 6 \n");

        Random rand = new Random();
        /*
         * for (int i = 0; i < 10; ++i) {
         * System.out.println(rand.nextInt());
         * }
         */

        // a) Generate random integers between -100 and +100 (inclusive).
        for (int i = 0; i < 10; ++i) {
            if (i == 0)
                System.out.print("a) " + rand.nextInt(100 - (-100) + 1 + (-100)) + ", ");
            else if (i == 10 - 1)
                System.out.print(rand.nextInt(100 - (-100) + 1 + (-100)) + ". \n");
            else
                System.out.print(rand.nextInt(100 - (-100) + 1 + (-100)) + ", ");
        }

        // b) Generate random integers between limits (pre-specified) a and b.
        Scanner aValue = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int a = aValue.nextInt();
        aValue.close();

        Scanner bValue = new Scanner(System.in);
        System.out.println("Enter the second value: ");
        int b = bValue.nextInt();
        bValue.close();

        if (a > b) {
            throw new IllegalArgumentException("The second value must be a larger number");
        } else {
            for (int i = 0; i < 10; ++i) {
                if (i == 10 - 1)
                    System.out.print(rand.nextInt(b - a + 1 + a) + ". \n");
                else
                    System.out.print(rand.nextInt(b - a + 1 + a) + ", ");
            }
        }

        // c) Generate random doubles between zero and one.
        for (int i = 0; i < 10; ++i) {
            if (i == 10 - 1)
                System.out.print(rand.nextDouble(1 - 0 + 1) + ". \n");
            else
                System.out.print(rand.nextDouble() + ", ");
        }

        // d) Generate random doubles between limits (pre-specified) a and b.
        if (a > b) {
            throw new IllegalArgumentException("The second value must be a larger number");
        } else {
            for (int i = 0; i < 10; ++i) {
                if (i == 10 - 1)
                    System.out.print(rand.nextDouble(b - a + 1 + a) + ". \n");
                else
                    System.out.print(rand.nextDouble(b - a + 1 + a) + ", ");
            }
        }

    }

}
