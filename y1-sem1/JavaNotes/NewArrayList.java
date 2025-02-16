import java.util.ArrayList;

public class NewArrayList {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<Integer> minArrayValue = new ArrayList<Integer>();

        minArrayValue.add(0, 20);
        minArrayValue.add(1, 20);
        minArrayValue.add(2, 20);
        minArrayValue.add(3, 20);
        minArrayValue.add(4, 20);
        minArrayValue.add(5, 20);
        minArrayValue.add(6, 20);
        minArrayValue.add(7, 20);

        int min = minArrayValue.get(0);

        for (int i = 1; i < minArrayValue.size(); i++) {
            int x = minArrayValue.get(i);

            if (x < min)
                min = x;
        }

    }

}
