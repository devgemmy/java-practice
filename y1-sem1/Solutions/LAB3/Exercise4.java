
public class Exercise4 {

    public static void main(String[] args) {
        int x = 4;
        while (x <= 11) {
            if (x == 11) {
                System.out.print(x);
            } else {
                System.out.print(x + ",");
            }
            x++;
        }
        System.out.print("\n");

        int x1 = 10;
        while (x1 <= 19) {
            if (x1 == 19) {
                System.out.print(x1);
            } else {
                System.out.print(x1 + ",");
            }
            x1 += 3;
        }
    }

}
