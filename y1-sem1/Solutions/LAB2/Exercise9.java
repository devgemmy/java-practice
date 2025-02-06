
public class Exercise9 {

    public static void main(String[] args) {

        int a = 10, b = -10, c = 5;

        /*
         * 
         * if ((a<b) && (b<c))
         * {
         * System.out.println("a<b<c");
         * }
         * else if ((a<c)&&(c<b))
         * {
         * System.out.println("a<c<b");
         * }
         * else if ((b<a)&&(a<c))
         * {
         * System.out.println("b<a<c");
         * }
         * else if ((b<c)&&(c<a))
         * {
         * System.out.println("b<c<a");
         * }
         * else if ((c<a)&&(a<b))
         * {
         * System.out.println("c<a<b");
         * }
         * else
         * {
         * System.out.println("c<b<a");
         * }
         * 
         * 
         */

        switch (((a < b) && (b < c)) ? 1
                : ((a < c) && (c < b)) ? 2
                        : ((b < a) && (a < c)) ? 3 : ((b < c) && (c < a)) ? 4 : ((c < a) && (a < b)) ? 5 : 6) {
            case 1: {
                System.out.println("a<b<c");
                break;
            }
            case 2: {
                System.out.println("a<c<b");
                break;
            }
            case 3: {
                System.out.println("b<a<c");
                break;
            }
            case 4: {
                System.out.println("b<c<a");
                break;
            }
            case 5: {
                System.out.println("c<a<b");
                break;
            }
            case 6: {
                System.out.println("c<b<a");
                break;
            }

        }

    }

}