import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {
        System.out.println("\n Lab 3 - Exercise 8 \n");

        // Scanner inputVal = new Scanner(System.in);
        //
        // while(true) {
        // System.out.println("Type 'Done' or 'done to stop the program.");
        // System.out.print("Enter any character: ");
        //
        // String val = inputVal.nextLine();
        //
        // if(val.equalsIgnoreCase("Done")) {
        // System.out.println("Thank You!");
        // inputVal.close();
        // break;
        // }
        //
        // char ch = val.charAt(0);
        //
        // if(ch >= 'A' && ch <= 'Z') {
        // System.out.println("Capital letter \n");
        // } else if(ch >= 'a' && ch <= 'z') {
        // System.out.println("Small letter \n");
        // } else if(ch >= '0' && ch <= '9') {
        // System.out.println("Digit \n");
        // } else {
        // System.out.println("Special Character \n");
        // }
        // }

        Scanner inputVal = new Scanner(System.in);
        System.out.println("Type 'Done' to stop the program");

        while (true) {
            System.out.print("Enter a character to check its type: ");
            String value = inputVal.nextLine();

            if (value.equalsIgnoreCase("Done")) {
                System.out.println("Thank you");
                inputVal.close();
                break;
            }

            char letter = value.charAt(0);

            if (letter >= 'A' && letter <= 'Z') {
                System.out.println("Capital Letter \n");
            } else if (letter >= 'a' && letter <= 'z') {
                System.out.println("Small Letter \n");
            } else if (letter >= '0' && letter <= '9') {
                System.out.println("Digit \n");
            } else {
                System.out.println("Special Character \n");
            }
        }

    }

}
