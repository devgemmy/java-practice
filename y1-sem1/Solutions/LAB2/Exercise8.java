import java.util.*;

public class Exercise8 {

    public static void main(String[] args) {

        int c;

        System.out.println("Input an integer: ");
        Scanner in = new Scanner(System.in);
        c = in.nextInt();

        if (c % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

}
