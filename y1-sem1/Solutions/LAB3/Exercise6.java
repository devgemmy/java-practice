
public class Exercise6 {

    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(i);
            }
        }
        System.out.print("\n");

        for (int i = 2; i < 7; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(i);
            }
        }
        System.out.print("\n");

        for (int i = 1; i < 7; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j < i + 1; j++) {
                    System.out.print("i");
                }
            }
        }
        System.out.print("\n");

        for (int i = 1; i < 8; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j < i + 1; j += 2) {
                    System.out.print("i");
                }
            }
        }
        System.out.print("\n");

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("i");
            }
        }
        System.out.print("\n");

        for (int i = 5; i >= 1; i--) {
            for (int j = i; j <= 5; j++) {
                System.out.print(i);
            }
        }
        System.out.print("\n");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 != 0) {
                    System.out.print("+");
                } else if (i % 2 == 0) {
                    System.out.print("*");
                }
            }
        }
        System.out.print("\n");

        for (int i = 2; i < 8; i++) {
            if (i % 3 == 0) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            }
            if (i % 3 == 1) {
                for (int j = 0; j < i; j++) {
                    System.out.print("+");
                }
            }
            if (i % 3 == 2) {
                for (int j = 0; j < i; j++) {
                    System.out.print("-");
                }
            }
        }
    }

}
