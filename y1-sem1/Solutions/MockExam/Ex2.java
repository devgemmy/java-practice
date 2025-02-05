import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("Type 'Done' or 'done' to Stop the program");
			System.out.print("Enter any character:- ");

			String Entry = s.nextLine();

			if (Entry.equalsIgnoreCase("Done"))
				break;
			else {
				char ch = Entry.charAt(0);

				if (ch >= 'A' && ch <= 'Z') {
					System.out.println("Capital Letter \n");
				} else if (ch >= 'a' && ch <= 'z') {
					System.out.println("Small Letter \n");
				} else if (ch >= '0' && ch <= '9') {
					System.out.println("Is a Number \n");
				} else {
					System.out.println("Special Character \n");
				}
			}
		}

	}

}
