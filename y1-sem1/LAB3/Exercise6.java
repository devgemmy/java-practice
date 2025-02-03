
public class Exercise6 {

    public static void main(String[] args) {
        System.out.println("Exercise 6" + "\n");

        // 1) 122333444455555
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(i);
            }
        }
        System.out.println();

        // 2) 22333444455555666666
        for (int i = 2; i < 7; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(i);
            }
        }
        System.out.println();

        // 3) 133355555
        for (int i = 1; i < 6; i = i + 2) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(i);
            }
        }
        System.out.println();

        // 4) 1335557777
        for (int i = 1; i < 8; i = i + 2) {
            for (int j = 1; j < i + 1; j = j + 2) {
                System.out.print(i);
            }
        }
        System.out.println();

        // 5) 555554444333221
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
        }
        System.out.println();

        // 6) 544333222211111
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= (6 - i); j++) {
                System.out.print(i);
            }
        }
        System.out.println();

        // 7) +**+++****+++++
        char b = '+';
        for (int i = 1; i < 6; i++) {
            if (i % 2 == 0)
                b = '*';
            else
                b = '+';
            for (int j = 1; j < i + 1; j++) {
                System.out.print(b);
            }
        }
        System.out.println();

        // 8) --***++++-----******+++++++
        char c = '-';
        for (int i = 2; i <= 7; i++) {
            if (i % 3 == 0)
                c = '*';
            else if (i == 4 || i == 7)
                c = '+';
            else
                c = '-';

            for (int j = 1; j < i + 1; j++) {
                System.out.print(c);
            }
        }
    }

}
