
public class Lab2Exercise2 {

	public static void main(String[] args) {
		int x = 100, y = 204, c = -204;
		double z = -23.1;
		boolean a = true, b = false;
		

		// 1) x < y
		if (x < y) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		// Output: True
		
		
		// 2) x > z and a = b
		if (x > z && a == b) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		// Output: False

		
		// 3) 2c > y
		if ((2 * c) > y) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		// Output: False
		
		
		// 4) x = b
		/*
		if (x == b) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		*/
		// INVALID: an integer cannot be compared to a boolean
		
		
		// 5) c ≠ y or c = y
		if (c != y || c == y) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		// Output: True
		
		
		// 6) z ≠ y and c = a
		/*
		if (z != y || c == a) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		*/
		// INVALID: an integer cannot be compared to a boolean
		
		
		// 5) y ≥ y and a+3 ≠ 2
		/*
		if (y >= y && (a + 3) != 2) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		*/
		// INVALID: an integer cannot be added to a boolean
	}

}
