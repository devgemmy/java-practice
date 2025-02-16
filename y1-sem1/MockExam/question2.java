import java.util.Scanner;

public class question2 {

    public static void main(String[] args) {

        Scanner value = new Scanner(System.in);
        System.out.println("Type 'Done' or 'done' to stop the program");

        while (true) {
            System.out.print("Enter a character: ");
            String input = value.nextLine();

            if (input.equalsIgnoreCase("Done")) {
                System.out.println("Thank you");
                value.close();
                break;
            }

            char check = input.charAt(0);
            if (check >= 'a' && check <= 'z') {
                System.out.println(input + " is a small letter \n");
            } else if (check >= 'A' && check <= 'Z') {
                System.out.println(input + " is a capital letter \n");
            } else if (check >= '0' && check <= '9') {
                System.out.println(input + " is a number \n");
            } else {
                System.out.println(input + " is a special character \n");
            }
        }

    }

}
