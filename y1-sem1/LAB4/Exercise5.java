
public class Exercise5 {

    public static void main(String[] args) {
        System.out.println("Lab 4 - Exercise 5");

        System.out.println("Value | Round | Floor | Ceiling");
        // b)
        double[] doubrray = { -167.1, 10.49, -23.5, 100.51, -98.9, 0.0007, 28.1, 46.49, 15.6880, 7490.54, 91.24 };
        for (int i = 0; i < doubrray.length; i++) {
            RoundingTest(doubrray[i]);
        }

    }

    // a)
    private static void RoundingTest(double x) {

        String mathTest = String.format(", floor = %1$.6f, ceil = %2$.6f", Math.floor(x), Math.ceil(x));
        System.out.println("Value of = " + x + ": round = " + Math.round(x) + mathTest);

    }

}
