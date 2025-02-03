
public class Exercise7 {

	public static void main(String[] args) {
		int y = 204, c = -204;
		
		// If Else Form
		if (c != y || c == y) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		// Ternary Form
		String result;
		result = (c != y || c == y) ? "True" : "False";
		System.out.println(result);
		
		// The Ternary operator style is better because it is shorter and have better readability. Also the System.out.println command runs only once.
	}

}
