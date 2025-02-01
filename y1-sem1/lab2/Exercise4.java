import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
		try (Scanner numInput = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			
			int limit = numInput.nextInt();
			if (limit % 2 == 0 && limit % 3 == 0) {
				System.out.println(limit + " is divisible by 2 and 3");
			} else {
				System.out.println(limit + " is NOT divisible by 2 and 3");
			}
			
			if (limit % 7 == 0 || limit % 9 == 0) {
				System.out.println(limit + " is divisible by 7 or 9");
			} else {
				System.out.println(limit + " is NOT divisible by 7 or 9");
			}
			
			if (limit % 2 == 0 && limit % 3 == 0 && limit % 5 != 0) {
				System.out.println(limit + " is divisible by 2 and 3, but not 5");
			} else {
				System.out.println(limit + " is NOT divisible by 2, 3 and 5");
			}
		}
		
		
		/*
		for (int r = 1; r <= 1000; r++) {
			if (r % 7 == 0 || r % 9 == 0) {
				System.out.println(r + " is divisible by 7 or 9");
			} else {
				System.out.println(r + " is NOT divisible by 7 or 9");
			}
			
			if (r % 2 == 0 && r % 3 == 0 && r % 5 != 0) {
				System.out.println(r + " is divisible by 2 and 3, but not 5");
			} else {
				System.out.println(r + " is NOT divisible by 2, 3 and 5");
			}
		}
		*/
		
		// Running this program a 1000 times took seconds
		
	}

}
