
public class Exercise5 {

    public static void main(String[] args) {

        int a = 65, b = 26;

        int c = a % b;

        while (c != 0) {
            a = b;
            b = c;
            c = a % b;
        }

        System.out.println("The hcf of " + a + " and " + b + " is = " + b);
    }
}
