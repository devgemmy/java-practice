
public class exercise3 {

	public static void main(String[] args) {
		int a = 100, g = 0;
		double b = 2.3, c = -52.2, y;
		boolean d = true;
		String e = "I am ", f = "a student", z;
		char h = '!';

		final double pi = 3.142;
		final String name = "Anthonia";

		// long x;

		// 1.
		y = a + b;
		System.out.println(y);
		// Output: 102.3

		// 2.
		// y = a + d;
		// System.out.println(y);
		// INVALID Output: The operator + won't work because d is a boolean.

		// 3.
		z = e + f;
		System.out.println(z);
		// Output: I am a student

		// 4.
		y = b * c;
		System.out.println(y);
		// Output: -120.06

		// 5.
		// pi = 22/7;
		// INVALID Output: The variable pi can't be reassigned because it is a constant
		// declared with the final keyword.

		// 6.
		// z = name / g;
		// System.out.println(z)
		// INVALID Output: The operator / won't work because name is a string and g is
		// an integer.

		// 7.
		// z = c / g;
		// System.out.println(z);
		// INVALID Output: g has to be a double for this statement to run.

		// 8.
		// SOLUTION: double x
		// x = 10;
		// x = Math.pow(10.0, 3.0);
		// System.out.println(x);
		// INVALID Output: The data type for the variable x is long not double.

		// 9.
		z = name + " is " + f + h;
		System.out.println(z);
		// Output: Anthonia is a student!

		// 10.
		// y = (name + 10)/(name + h);
		// System.out.println(y);
		// INVALID Output: The operator / doesn't calculate strings and name is a
		// string. The + operator can only be used to concatenate strings.

		// 11.
		// x = (a + b)/(d + c);
		// System.out.println(y);
		// INVALID Output: The operator + can't be used to a boolean and a double. A
		// double and a long also can't be added.

		// 12.
		y = 100.3;
		y = (y / (a + b)) - c;
		System.out.println(y);
		// Output: 53.18044965786902

		// 13.
		// x = Math.pow(x, 2.0);
		// Math(y, 2.0) + Math(z, 2.0);
		// INVALID Output: The left-hand side of an assignment must be a variable
		// SOLUTION
		double x = 10.0;
		x = Math.pow(x, 2.0);
		System.out.println(x);
		// x = Math.pow(y, 2.0) + Math.pow(z, 2.0);
		// INVALID Output: z is a string and it cannpt have an exponent

		// 14.
		// name = "Is " + f - h;
		// System.out.println(name);
		// INVALID Output: String and Characters cannot be subtracted, only concatenated

		// 15.
		y = ((pi + 1) / (pi + 2)) / pi + 3;
		System.out.println(y);
		// Output: 3.2563727379840905

		// 16.
		y = -2;
		y = Math.cbrt(Math.pow(y, 2.0) / b);
		System.out.println(y);
		// Output: 1.2025709773288682

		// 17.
		y = b / g;
		z = y + name;
		System.out.println(z);
		// Output: InfinityAnthonia

		// 18.
		z = name;
		z = b / g + z;
		System.out.println(z);
		// Output: InfinityAnthonia

		// 19.
		y = -2.3;
		y = (a * Math.pow(y, 2.0)) + (b * y) + c;
		System.out.println(y);
		// Output: 471.50999999999993

		// 20.
		// y = Math.pow((y-(a-b)), Math.pow((b-c),(c-d))); XX
		// CORRECT ANSWER: y - Math.pow((a-b, Math.pow((b-c), (c-d)))
		// INVALID Output: d is a boolean therefore it cannot be subtracted from c, and
		// c is a negative double.
	}

}
