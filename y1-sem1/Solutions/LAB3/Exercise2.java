
public class Exercise2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int i;
        for (i = 4; i < 12; i++) {
            if (i == 11) {
                System.out.print(i);
            } else {
                System.out.print(i + ",");
            }
        }
        System.out.print("\n");

        for (i = 10; i < 20; i = 3) {
            if (i == 19) {
                System.out.print(i);
            } else {
                System.out.print(i + ",");
            }
        }
        System.out.print("\n");

        for (i = 1; i < 17; i += 3) {
            if (i == 16) {
                System.out.print(i);
            } else {
                System.out.print(i + ",");
            }
        }
        System.out.print("\n");

        for (i = 2; i < 12; i++) {
            if (i == 12) {
                System.out.print(i);
            } else {
                System.out.print(i + ",");
            }
        }
        System.out.print("\n");

        for (i = 1; i <= 10; i++) {
            int result = i * i;
            if (result == 100) {
                System.out.print(result);
            } else {
                System.out.print(i + ",");
            }
        }
        System.out.print("\n");

        for (i = -10; i <= 10; i += 2) {
            if (i == 10) {
                System.out.print(i);
            } else {
                System.out.print(i + ",");
            }
        }
        System.out.print("\n");

        for (i = 20; i <= 20; i += 5) {
            if (i == 0)
                continue;
            if (i == 20) {
                System.out.print(i);
            } else {
                System.out.print(i + ",");
            }
        }
    }

}
