
public class Lab3Exercise3 {

    public static void main(String[] args) {
        System.out.println("Exercise 3" + "\n");

        // 1) ++++++++++
        for (int i = 0; i < 10; i++) {
            System.out.print("+");
        }
        System.out.println(" ");

        // 2) ---------
        for (int i = 0; i < 9; i++) {
            System.out.print("-");
        }
        System.out.println(" ");

        // 3) +-+-+-+-+-
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print("+");
            } else {
                System.out.print("-");
            }
        }
        System.out.println(" ");

        // 4) *+-*+-*+-
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    System.out.print("*");
                } else if (j == 1) {
                    System.out.print("+");
                } else {
                    System.out.print("-");
                }
            }
        }
        System.out.println(" ");

        // 5) *+-*+-*+-*
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0 || (i == 3 && j < 1)) {
                    System.out.print("*");
                } else if (j == 1 && i != 3) {
                    System.out.print("+");
                } else if (j == 2 && i != 3) {
                    System.out.print("-");
                }
            }
        }
        System.out.println(" ");

        // 6) **++**++**++
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 0 || j == 1) {
                    System.out.print("*");
                } else {
                    System.out.print("+");
                }
            }
        }
        System.out.println(" ");

        // 7) ***+++---***+++---
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 9; j++) {
                if (j < 3) {
                    System.out.print("*");
                } else if (j < 6) {
                    System.out.print("+");
                } else {
                    System.out.print("-");
                }
            }
        }
        System.out.println(" ");

        // 8) ***+++------+++***
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 9; j++) {
                if ((j < 3 && i == 0) || (i == 1 && j > 5)) {
                    System.out.print("*");
                } else if ((j > 2 && j < 6) || (i == 1 && j > 5)) {
                    System.out.print("+");
                } else {
                    System.out.print("-");
                }
            }
        }
        ;
    }

}
