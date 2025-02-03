
public class Exercise4 {

    public static void main(String[] args) {
        System.out.println("Exercise 4: While Loop version" + "\n");

        // 1) 4, 5, 6, 7, 8, 9, 10, 11
        int i = 4;
        while (i <= 11) {
            if (i == 11)
                System.out.print(i);
            else
                System.out.print(i + ", ");
            i++;
        }
        System.out.println();

        // 2) 10, 13, 16, 19
        i = 10;
        while (i < 20) {
            if (i == 19)
                System.out.print(i);
            else
                System.out.print(i + ", ");
            i = i + 3;
        }
        System.out.println();

        // 3) 1, 4, 7, 10, 13, 16
        i = 1;
        while (i <= 16) {
            if (i == 16)
                System.out.print(i);
            else
                System.out.print(i + ", ");
            i = i + 3;
        }
        System.out.println();

        // 4) 2, 4, 6, 8, 10, 12
        i = 2;
        while (i <= 12) {
            if (i == 12)
                System.out.print(i);
            else
                System.out.print(i + ", ");
            i = i + 2;
        }
        System.out.println();

        // 5) 1, 4, 9, 16, 25, 36, 49, 64, 81, 100
        i = 1;
        while (i <= 10) {
            if (i == 10)
                System.out.print(i);
            else
                System.out.print(i + ", ");
            i++;
        }
        System.out.println();

        // 6) -10, -8, -6, -4, -2, 0, 2, 4, 6, 8, 10
        i = -10;
        while (i <= 10) {
            if (i == 10)
                System.out.print(i);
            else
                System.out.print(i + ", ");
            i = i + 2;
        }
        System.out.println();

        // 7) -20, -15, -10, -5, 5, 10, 15, 20
        i = -20;
        while (i <= 10) {
            if (i == 10)
                System.out.print(i);
            else
                System.out.print(i + ", ");
            i = i + 5;
        }
        System.out.println();
    }

}
