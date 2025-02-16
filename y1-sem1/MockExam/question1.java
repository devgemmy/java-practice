
public class question1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + ", " + j);
            }
        }

        System.out.println("==========");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i < j)
                    System.out.println(i + ", " + j);
            }
        }

        System.out.println("==========");

        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j <= 8; j++) {
                System.out.println(i + ", " + j);
            }
        }

    }

}
