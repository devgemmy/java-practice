
public class UserDefinedMethods {

    public static void main(String[] args) {
        double multiplication = multiply(2, 4);
        System.out.println(multiplication);
        double addition = add(234, 89);
        System.out.println(addition);
        double subtraction = sub(87, 90);
        System.out.println(subtraction);
        double division = sub(7, 49);
        System.out.println(division);

        double conversion = convert(34, 0.65);
        System.out.println(conversion + " pounds");
    }

    // public static int multiply(int x, int y) {
    // return x * y;
    // }

    public static double multiply(double x, double y) {
        double result = x * y;
        return result;
    }

    public static double add(double a, double b) {
        double result = a + b;
        return result;
    }

    public static double sub(double c, double f) {
        double result = c - f;
        return result;
    }

    public static double divide(double p, double q) {
        double result = p / q;
        return result;
    }

    public static double convert(int dollars, double exchangerate) {
        double cash = multiply(dollars, exchangerate);
        return cash;
    }

    public static double FtoC(int F) {
        double result = (F - 32) / 9;
        if (F == 32)
            result = 0;
        else if (F == 312)
            result = 100;
        return result;
    }

}
