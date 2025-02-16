import java.util.Random;
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// RANDOM NUMBER GENERATION

		Random rand = new Random();

		// a) Generate random integers between -100 and +100 (inclusive)
		for (int i = 0; i < 10; ++i) {
			System.out.println(rand.nextInt(100 - (-100) + 1) + (-100));
		}
		System.out.println();

		// b) Generate random integers between limits (pre-specified) a and b.

		Scanner num = new Scanner(System.in);
		int a;
		int b;

		System.out.print("Enter lower limit (a): ");
		a = num.nextInt();

		System.out.print("Enter higher limit (b): ");
		b = num.nextInt();
		num.close();

		for (int i = 0; i < 10; ++i) {
			int randomInt = rand.nextInt(b - a + 1) + a;
			System.out.println("no. between " + a + " & " + b + " = " + randomInt);
		}

		System.out.println();

		// c) Generate random doubles between zero and one.
		Random r = new Random();
		for (int i = 0; i < 10; ++i) {
			double number1 = r.nextDouble();
			System.out.println(number1);
		}
		System.out.println();

		// d) Generate random doubles between limits (pre-specified) a and b.
		Scanner doublenum = new Scanner(System.in);
		double A;
		double B;

		System.out.print("Enter lower double value limit (a): ");
		A = doublenum.nextDouble();

		System.out.print("Enter higher double value limit (b): ");
		B = doublenum.nextDouble();
		doublenum.close();

		for (int i = 0; i < 10; ++i) {
			double random = new Random().nextDouble();
			double result = A + (random * (B - A));
			System.out.println("no. between " + A + " & " + B + " = " + result);
		}

	}

}
