
public class ExceptionsStudy {

    public static void main(String[] args) {
        System.out.println(divide(1, 0));

    }

    public static int divide(int x, int y) {
        int result = -1;
        System.out.println("Computing division...");

        try {
            result = x / y;
        } catch (ArithmeticException e) {
            System.out.println("Exception: division by zero");
        } finally {
            if (result != -1) {
                System.out.println("Finally the block executes");
                System.out.println("Result: " + result);
            } else {
                System.out.println("Finally the block executes. Execution Occurred");
                return result;
            }
        }

        return result;
    }

}
