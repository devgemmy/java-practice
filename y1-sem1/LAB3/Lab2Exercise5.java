import java.util.Scanner;

public class Lab2Exercise5 {

    public static void main(String[] args) {
        System.out.println("Exercise 5: Euclid's Algorithm" + "\n");

        try (// First Number
                Scanner getNumA = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            int a = getNumA.nextInt();

            try (// Second Number
                    Scanner getNumB = new Scanner(System.in)) {
                System.out.print("Enter the second number: ");
                int b = getNumB.nextInt();

                // HCF(88,26) = 2
                // HCF(54,87) = 3
                // HCF(16,84) = 4
                // HCF(55,25) = 5
                // HCF(42,72) = 6
                // HCF(77,28) = 7
                // HCF(80,88) = 8

                int c = a % b;

                while (c != 0) {
                    a = b;
                    b = c;
                    c = a % b;
                    // System.out.println("c: " + c);

                }

                System.out.println("The HCF is " + b);
            }
        }

    }

}
