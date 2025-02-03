import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		try (Scanner inputValue = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			
			int val = inputValue.nextInt();
			
			String value = (val % 2 == 0) ? (val + " is an even number") : (val + " is an odd number");
			System.out.println(value);
		}

	}

}
