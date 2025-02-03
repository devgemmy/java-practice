import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		// SWITCH Statement Form: Exercise 3
		int a = 0, b = 0, c = -3;
		
		/*
		boolean condition;
		int track = 0;
		for (int t = 0; t <= 5; t++) {
			track = t;
		};
		*/
		
		switch((a < b && b < c) ? "abc" : (b < c && c < a) ? "bca" : (c < a && a < b) ? "cab" : (c < b && b < a) ? "cba" : (b < a && a < c) ? "bac" : (a < c && c < b) ? "acb" : "") {
			case "abc": {
				// (a < b && b < c)
				System.out.println("The correct order" + " is " + a + " < " + b + " < " + c);
				break;
			}
			case "bca": {
				// (b < c && c < a)
				System.out.println("The correct order" + " is " + b + " < " + c + " < " + a);
				break;
			}
			case "cab": {
				// (c < a && a < b);
				System.out.println("The correct order" + " is " + c + " < " + a + " < " + b);
				break;
			}
			case "cba": {
				// (c < b && b < a);
				System.out.println("The correct order" + " is " + c + " < " + b + " < " + a);
				break;
			}
			case "bac": {
				// (b < a && a < c);
				System.out.println("The correct order" + " is " + b + " < " + a + " < " + c);
				break;
			}
			case "acb": {
				// (a < c && c < b);
				System.out.println("The correct order" + " is " + a + " < " + c + " < " + b);
				break;
			}
			default: {
				System.out.println("There is no correct order");
				break;
			}
		}
		
		
		// TERNARY OPERATOR (?:) Form: Exercise 3
		String result = (a < b && b < c) ? ("The correct order" + " is " + a + " < " + b + " < " + c) 
				: (b < c && c < a) ? ("The correct order" + " is " + b + " < " + c + " < " + a) 
				: (c < a && a < b) ? ("The correct order" + " is " + c + " < " + a + " < " + b) 
				: (c < b && b < a) ? ("The correct order" + " is " + c + " < " + b + " < " + a)
				: (b < a && a < c) ? ("The correct order" + " is " + b + " < " + a + " < " + c)
				: (a < c && c < b) ? ("The correct order" + " is " + a + " < " + c + " < " + b)
				: "There is no correct order";
		
		System.out.println(result);
		
		// String 
		// abc = (a < b && b < c) ? ("The correct order" + " is " + a + " < " + b + " < " + c) : "",
		// bca = (b < c && c < a) ? ("The correct order" + " is " + b + " < " + c + " < " + a) : "",
		// cab = (c < a && a < b) ? ("The correct order" + " is " + c + " < " + a + " < " + b) : "",
		// cba = (c < b && b < a) ? ("The correct order" + " is " + c + " < " + b + " < " + a) : "",
		// bac = (b < a && a < c) ? ("The correct order" + " is " + b + " < " + a + " < " + c) : "",
		// acb = (a < c && c < b) ? ("The correct order" + " is " + a + " < " + c + " < " + b) : "";
		
		// System.out.println(abc + bca + cab + cba + bac + acb);
		
		
		

		
		try (Scanner numInput = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			
			// SWITCH Statement Form: Exercise 4
			int limit = numInput.nextInt();
			
			
			// int case_check = 0;
			
					
			switch((limit % 2 == 0 && limit % 3 == 0) ? 2 : (limit % 7 == 0 || limit % 9 == 0) ? 7 : (limit % 2 == 0 && limit % 3 == 0 && limit % 5 != 0) ? 5 : 0) {
				case 2: {
					// (limit % 2 == 0 && limit % 3 == 0)
					System.out.println(limit + " is divisible by 2 and 3");
					break;
				}
				case 7: {
					// (limit % 7 == 0 || limit % 9 == 0)
					System.out.println(limit + " is divisible by 7 or 9");
					break;
				}
				case 5: {
					// (limit % 2 == 0 && limit % 3 == 0 && limit % 5 != 0)
					System.out.println(limit + " is divisible by 2 and 3, but not 5");
					break;
				}
				default: {
					break;
				}
			}
			
		
			
			// TERNARY OPERATOR (?:) Form: Exercise 4
			String two_three_output = (limit % 2 == 0 && limit % 3 == 0) ? (limit + " is divisible by 2 and 3") : (limit + " is NOT divisible by 2 and 3");
			System.out.println(two_three_output);
			
			String seven_nine_output = (limit % 7 == 0 || limit % 9 == 0) ? (limit + " is divisible by 7 or 9") : (limit + " is NOT divisible by 7 or 9");
			System.out.println(seven_nine_output);
			
			String two_three_not_five_output = (limit % 2 == 0 && limit % 3 == 0 && limit % 5 != 0) ? (limit + " is divisible by 2 and 3, but not 5") : (limit + " is NOT divisible by 2, 3 and 5");
			System.out.println(two_three_not_five_output);
		}
	}

}
