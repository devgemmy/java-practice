package Exercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

class RandomGeneratorClass {
    private String name;

    public RandomGeneratorClass(String naming) {
        this.name = naming;
    }

    public static void main(String[] args) {
        ArrayList<Integer> RandomArrayList = new ArrayList<Integer>();

        for (int a = 0; a < 20; a++) {
            RandomArrayList.add(RandomGeneratorMethod());
        }
        Collections.sort(RandomArrayList);
        System.out.println("Random nums from RGClass: " + RandomArrayList);
    }

    public static int RandomGeneratorMethod() {
        Random randoms = new Random();
        // (max - min + 1) + min
        return randoms.nextInt(300 - 30 + 1) + 30;
    }

}



