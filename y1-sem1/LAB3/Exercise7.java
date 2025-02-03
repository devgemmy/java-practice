
public class Exercise7 {

    public static void main(String[] args) {
        System.out.println("Exercise 7" + "\n");

        /*
         * Write nested loops that perform the following tasks:
         * 1) Display all the possible pairs of numbers between 1 and 10 (Hint: there
         * are 100 pairs)
         * 2) Display all possible pairs for the numbers i and j that are i < j and 0 <
         * i and j < 11 (Hint: there are 45 pairs)
         * 3) Display all possible pairs of the numbers 1,2,3,4 paired with 4,5,6,7,8
         * (Hint: there are 20 pairs)
         */

        // 1)
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " and " + j);
            }
        }

        System.out.println();

        // 2)
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i < j)
                    System.out.println(i + " and " + j);
            }
        }

        // 3)
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j <= 8; j++) {
                System.out.println(i + " and " + j);
            }
        }

        System.out.println();
    }

}
