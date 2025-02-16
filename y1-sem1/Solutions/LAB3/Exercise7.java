
public class Exercise7 {

    public static void main(String[] args) {

        for (int x = 1; x < 11; x++) {
            for (int y = 1; y < 11; y++) {
                System.out.print(x + " and " + y);
            }
        }
        System.out.println("\n");

        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 11; j++) {
                if (i < j) {
                    System.out.print(i + " and " + j);
                }
            }
        }
        System.out.println("\n");

        for (int i = 1; i < 4; i++) {
            for (int j = 4; j <= 8; j++) {
                System.out.print(i + " and " + j);
            }
        }
    }

}
