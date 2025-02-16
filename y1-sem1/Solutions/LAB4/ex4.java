import java.text.DecimalFormat;

public class ex4 {

	public static void main(String args[]) {

		String a = "Hello";
		String b = "World";
		double x = 123.456;
		double y = 17.0 / 3.0;
		double z = Math.sqrt(2);
		double number = 1.0 / 3.0;
		// double to sting for values X,Y,Z
		String x1 = Double.toString(x);
		String y1 = Double.toString(y);
		String z1 = Double.toString(z);

		System.out.println(number);

		DecimalFormat number_format = new DecimalFormat("#.##");
		String formatted_string = number_format.format(number);
		System.out.println(formatted_string);

		// a) Display y to three decimal places
		DecimalFormat yFormat = new DecimalFormat("#.###");
		String YString = yFormat.format(y);
		System.out.println(YString);

		/*
		 * b) Display how many digits come before the decimal point and how many comes
		 * after a number.
		 * Test this program on x, y and z Hint: You may find the split method useful
		 */

		String[] convertX = x1.split("\\.");
		System.out.println("x before decimal value: " + convertX[0].length());
		System.out.println("x after decimal value: " + convertX[1].length());

		String[] convertY = y1.split("\\.");
		System.out.println("y before decimal value: " + convertY[0].length());
		System.out.println("y after decimal value: " + convertY[1].length());

		String[] convertZ = z1.split("\\.");
		System.out.println("Z before decimal value: " + convertZ[0].length());
		System.out.println("Z after decimal value: " + convertZ[1].length());

		// c) Create a string c that consists of a in reverse concatenated with b,
		// including a space between them

		String Reverse = "";

		for (int i = a.length() - 1; i >= 0; i--) {
			Reverse = Reverse + a.charAt(i);
		}
		String c = Reverse + " " + b;
		System.out.println(c);

		// d) Search for the substring ‘ll’ in c and replace it for ‘ppp’
		c = c.replace("ll", "ppp");
		System.out.println(c);

	}
}
