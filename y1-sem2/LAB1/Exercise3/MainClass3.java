package Exercise3;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass3 {
    public static void main(String[] args) {
        RandomGeneratorClass rgInstance = new RandomGeneratorClass("RG1");

        ArrayList<Integer> rgArray = new ArrayList<Integer>();

        for (int r = 0; r < 20; r++) {
            rgArray.add(rgInstance.RandomGeneratorMethod());
        }
        Collections.sort(rgArray);
        System.out.println("Random nums from RGInstance: " + rgArray);
    }
}
