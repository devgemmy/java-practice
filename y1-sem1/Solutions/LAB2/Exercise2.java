
public class Exercise2 {
    static public void main(String args[]) {

        int x = 100;
        int y = 204;
        double z = -23.1;
        boolean a = true;
        boolean b = false;
        double c = -204;

        if (x < y)// 1.
        {
            System.out.println("1. " + "True");
        } else {
            System.out.println("1. " + "False");
        }

        if (x > z && a == b)// 2.
        {
            System.out.println("2. " + "True");
        } else {
            System.out.println("2. " + "False");
        }

        if (2 * c > y) // 3.
        {
            System.out.println("3. " + "True");
        } else {
            System.out.println("3. " + "False");
        }

        /*
         * if (x==b)//4. The operator can't run due to int and boolean are together
         * {
         * System.out.println("4. "+ "True");
         * }
         * else
         * {
         * System.out.println("4. "+"False");
         * }
         */

        if (c != y || c == y)// 5.
        {
            System.out.println("5. " + "True");
        } else {
            System.out.println("5. " + "False");
        }

        /*
         * if (z!=y && c==a)//6.The operator can't take value because of int and boolean
         * are together.
         * {
         * System.out.println("6. "+ "True");
         * }
         * else
         * {
         * System.out.println("6. "+"False");
         * }
         */

        /*
         * if (y>=y && a+3!=2)//7. the operator can't take value of booelean and it
         * can't run because of boolean and numbers are together.
         * {
         * System.out.println("7. "+ "True");
         * }
         * else
         * {
         * System.out.println("7. "+"False");
         * }
         */

    }

}
