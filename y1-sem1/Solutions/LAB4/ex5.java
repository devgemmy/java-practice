
public class ex5 {

	public static void main(String[] args) {
		RoundingTest(10.2); // 1
		RoundingTest(-100.1); // 2
		RoundingTest(-100.49); // 3
		RoundingTest(-100.5); // 4
		RoundingTest(-100.51); // 5
		RoundingTest(-100.9); // 6
		RoundingTest(0); // 7
		RoundingTest(100.1); // 8
		RoundingTest(100.49); // 9
		RoundingTest(100.5); // 10
		RoundingTest(100.51); // 11
		RoundingTest(100.9); // 12
	}

	public static void RoundingTest(double x) {

		System.out.println("for " + String.format("%.6f", x) + ", ciel = " + String.format("%.6f", Math.ceil(x))
				+ ", floor = " + String.format("%.6f", Math.floor(x)) + ", round = " + Math.round(x));

		/*
		 * //or you can use the following code
		 * 
		 * String For = String.format("For " + "%.6f", x);
		 * 
		 * System.out.println(For);
		 * 
		 * String Ceiling = String.format("Ceil " + "%.6f", Math.ceil(x));
		 * 
		 * System.out.println(Ceiling);
		 * 
		 * String Floor = String.format("Floor " + "%.6f", Math.floor(x));
		 * 
		 * System.out.println(Floor);
		 * 
		 * String Round = String.format("Round " + "%.0f", Math.rint(x));
		 * 
		 * System.out.println(Round);
		 * 
		 * System.out.println("");
		 * 
		 */
	}

}