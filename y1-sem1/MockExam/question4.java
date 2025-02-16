import java.util.ArrayList;
import java.util.Scanner;

public class question4 {

    public static void main(String[] args) {

        Scanner value = new Scanner(System.in);
        System.out.println("Enter a list of words to find the longest one. Type done to stop");

        ArrayList<String> inputArray = new ArrayList<String>();

        while (true) {

            System.out.print("Enter the words: ");
            String input = value.nextLine();

            if (input.equalsIgnoreCase("Done")) {
                System.out.println("List of all words: " + inputArray);
                System.out.println("The longest word(s): " + longest_word(inputArray));
                value.close();
                break;
            } else {
                inputArray.add(input);
            }
        }

    }

    public static String longest_word(ArrayList<String> val) {

        String longest = "";
        int initalLen = val.get(0).length();

        for (int i = 0; i < val.size(); i++) {
            if (val.get(i).length() > initalLen) {
                initalLen = val.get(i).length();
                longest = val.get(i);
            } else if (val.get(i).length() == initalLen) {
                longest = (longest == "") ? (longest = val.get(i)) : (longest += ", " + val.get(i));
            }
        }
        return longest;

    }

}
