import java.util.Scanner;

public class BioData {

    public static void main(String[] args) {
        // Java Conditionals Notes

        @SuppressWarnings("resource")
        Scanner myscanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");

        String name = myscanner.nextLine();
        System.out.print("Enter your Zodiac sign: ");

        String zodiac = myscanner.nextLine();
        System.out.print("Enter your weight (kg): ");

        double weight = myscanner.nextDouble();
        System.out.print("Enter your lucky number: ");

        int luckyNum = myscanner.nextInt();
        System.out.println("Hello, " + name + ".");
        System.out.println("Your lucky number is " + luckyNum + ".");
        System.out.println("You weight " + weight + " kg.");
        System.out.println("Your Zodiac sign is " + zodiac + ".");

    }

}
