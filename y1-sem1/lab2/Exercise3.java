
public class exercise3 {

	public static void main(String[] args) {
		int a = 12, b = -7, c = 63;
		
		// System.out.println(Math.min(a, b));
		
		if (a < b && b < c) {
			System.out.println("The correct order" + " is " + a + " < " + b + " < " + c);
		} else if (b < c && c < a) {
			System.out.println("The correct order" + " is " + b + " < " + c + " < " + a);
		} else if (c < a && a < b) {
			System.out.println("The correct order" + " is " + c + " < " + a + " < " + b);
		} else if (c < b && b < a) {
			System.out.println("The correct order" + " is " + c + " < " + b + " < " + a);
		} else if (b < a && a < c) {
			System.out.println("The correct order" + " is " + b + " < " + a + " < " + c);
		} else if (a < c && c < b){
			System.out.println("The correct order" + " is " + a + " < " + c + " < " + b);
		} else {
			System.out.println("There is no correct order");
		}

	}

}
