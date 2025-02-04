import java.util.ArrayList;

public class Exercise2 {

    public static void main(String[] args) {
        System.out.println("Lab 4 - Exercise 2 \n");

        ArrayList<Double> heightList = new ArrayList<Double>();

        heightList.add(170.0);
        heightList.add(162.5);
        heightList.add(152.7);
        heightList.add(189.5);
        heightList.add(191.6);
        heightList.add(156.3);
        heightList.add(168.5);
        heightList.add(174.0);
        heightList.add(145.2);
        heightList.add(172.4);

        // a.
        heightList.remove(2);

        // b.
        heightList.add(154.7);
        heightList.add(166.3);
        heightList.add(171.2);
        heightList.add(158.6);
        heightList.add(182.6);

        // c.
        /*
         * BubbleSort(A) ... from Logic and Computation Lecture 8
         * {
         * m = lengthOfArray
         * { for k = 1 to lengthOfArray-1
         * flag = 0
         * for i = 0 to m-k
         * { if (A[i]> A[i+1] )
         * {swap (A[i], A[i+1])
         * flag = 1
         * }
         * }
         * if (flag == 0) break
         * }
         * }
         */

        for (int k = 1; k < heightList.size() - 1; k++) {
            boolean flag = false;
            for (int i = 0; i < (heightList.size() - k); i++) {
                int s = i + 1;
                if (heightList.get(i) > heightList.get(s)) {
                    double swap = heightList.get(i);
                    heightList.set(i, heightList.get(s));
                    heightList.set(s, swap);
                    flag = true;
                }
            }
            if (flag == false)
                break;
        }

        /*
         * k = 1; k < (14 - 1); = flag is false
         * i = 0; i < (14 - 1 = 13); = s is 0 + 1
         * value at 0 > value at 1
         * SWAP = flag is true now; i + 1 = 1
         * i = 1; i < (14 - 1 = 13); = s is 1 + 1
         * value at 1 > value at 2
         * SWAP = flag is remains true; i + 1 = 2
         * i = 12; i < (14 - 1 = 13); = s is 12 + 1
         * value at 1 > value at 2
         */

        ArrayList<Double> heightsList = new ArrayList<Double>();
        heightsList.add(172.0);
        heightsList.add(192.0);
        heightsList.add(156.0);
        heightsList.add(175.0);
        heightsList.add(186.0);
        heightsList.add(184.0);
        heightsList.add(159.0);
        heightsList.add(168.0);
        heightsList.add(178.0);
        heightsList.add(164.0);
        // part1
        heightsList.remove(2);
        // part2
        heightsList.add(183.0);
        heightsList.add(167.0);
        heightsList.add(174.5);
        heightsList.add(154.0);
        heightsList.add(166.0);

        double sort = 0;
        for (int i = 0; i < heightsList.size(); i++) {
            for (int j = 1; j < heightsList.size(); j++) {
                if (heightsList.get(j - 1) > heightsList.get(j)) {
                    sort = heightsList.get(j - 1);
                    heightsList.remove(j - 1);
                    heightsList.add(j, sort);
                }

            }
        }

        // d.
        System.out.println("length: " + heightList.size());
        System.out.println("values: " + heightList);

        // e.
        // minimum:
        double minHeight = heightList.get(0);
        for (int i = 0; i < heightList.size(); i++) {
            double x = heightList.get(0);
            if (x < minHeight)
                minHeight = x;
        }
        // maximum:
        double maxHeight = heightList.get(0);
        for (int i = 0; i < heightList.size(); i++) {
            double y = heightList.get(i);
            if (y > maxHeight)
                maxHeight = y;
        }
        System.out.println("\nThe minimum height is: " + minHeight + "\nThe maximum height is: " + maxHeight);

    }

}
