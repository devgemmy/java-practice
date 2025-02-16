import java.util.ArrayList;
import java.util.Random;

public class question3 {

    public static void main(String[] args) {

        Random rand = new Random();

        // for(int i = 0; i < 10; ++i) {
        // System.out.println(rand.nextInt());
        // }

        /*
         * Modify, run and test the program as follows:
         * A. Generate 10 random integers between 10 and 100 (inclusive), store these
         * numbers in an
         * array list, and then, print the elements of the array list.
         * B. Generate 10 random doubles between zero and one (inclusive), store these
         * numbers in an
         * array list, and then, print the elements of the array list.
         */
        ArrayList<Integer> intArray = new ArrayList<Integer>();

        for (int i = 0; i < 10; ++i) {
            intArray.add(rand.nextInt(100 - 10 + 1 + 10));
        }

        System.out.println(intArray);

        ArrayList<Double> intZerone = new ArrayList<Double>();

        for (int i = 0; i < 10; ++i) {
            intZerone.add(rand.nextDouble(1 - 0 + 1));
        }

        System.out.println(intZerone);
    }

}
