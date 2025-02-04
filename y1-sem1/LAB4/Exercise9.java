import java.util.ArrayList;
import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {
        System.out.println("Lab 4 - Exercise 9 \n");

        System.out.println("Type 'Done' to see your list of words and find the longest word.");
        Scanner value = new Scanner(System.in);
        ArrayList<String> wordsArray = new ArrayList<String>();

        while (true) {

            System.out.print("Enter a word: ");

            String word = value.nextLine();

            if (word.equalsIgnoreCase("Done")) {
                System.out.println("List of all words: " + wordsArray);
                System.out.println("The longest word(s): " + Longest_Word(wordsArray));
                value.close();
                break;
            } else {
                wordsArray.add(word);
            }
        }
    }

    public static String Longest_Word(ArrayList<String> strArr) {

        String resultString = "";
        int initLen = strArr.get(0).length();

        for (int a = 0; a < strArr.size(); a++) {
            if (strArr.get(a).length() > initLen) {
                initLen = strArr.get(a).length();
                resultString = strArr.get(a);
            } else if (strArr.get(a).length() == initLen) {
                resultString = (resultString == "") ? (resultString = strArr.get(a))
                        : (resultString += ", " + strArr.get(a));
            }
        }

        return resultString;
    }

}
