
public class Exercise1 {

    public static void main(String[] args) {
        System.out.println("Exercise 1" + "\n");

        for (int n = 1; n <= 100; n++) {

            // 1) Displays if a whole number (>0) is divisible by 2 and 3
            if (n % 2 == 0 && n % 3 == 0)
                System.out.println(n + " is divisible by 2 and 3");

            // 2) Displays if a whole number (>0) is divisible by 7 or 9
            if (n % 7 == 0 || n % 9 == 0)
                System.out.println(n + " is divisible by 7 or 9");

            // 3) Displays if a whole number (>0) is divisible by 2 and 3 but not 5
            if (n % 2 == 0 && n % 3 == 0 && n % 5 != 0)
                System.out.println(n + " is divisible by 2 and 3, but not 5");
        }

    }

}
