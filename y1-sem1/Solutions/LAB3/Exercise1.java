
public class Exercise1 {

	public static void main(String[] args) {

		int x;
		for (x = 1; x <= 100; x++) {

			if (x % 2 == 0 && x % 3 == 0) {
				System.out.println(x + "is divisible by 2 and 3");
			} else {
				System.out.println(x + "is not divisible by 2 and 3");
			}

			if (x % 7 == 0 || x % 9 == 0) {
				System.out.println(x + "is divisible by 7 and 9");
			} else {
				System.out.println(x + "is not divisible by 7 and 9");
			}

			if ((x % 2 == 0 && x % 3 == 0) && x % 5 != 0) {
				System.out.println(x + "is divisible by 2 and 3 but not divisible by 5");
			} else {
				System.out.println(x + "is divisible by 2 and 3");
			}
		}
	}

}
