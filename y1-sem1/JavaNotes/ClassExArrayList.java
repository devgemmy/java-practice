import java.util.ArrayList;

public class ClassExArrayList {

    public static void main(String[] args) {
        // Java ArrayList Notes
        // System.out.println("Hello");

        ArrayList<Integer> minArrayValue = new ArrayList<Integer>();

        minArrayValue.add(20);
        minArrayValue.add(19);
        minArrayValue.add(1);
        minArrayValue.add(5);
        minArrayValue.add(-1);
        minArrayValue.add(27);
        minArrayValue.add(19);
        minArrayValue.add(5);
        int min = minArrayValue.get(0);

        for (int i = 1; i < minArrayValue.size(); i++) {
            int x = minArrayValue.get(i);

            if (x < min)
                min = x;

        }
        System.out.println(min);

    }

}
