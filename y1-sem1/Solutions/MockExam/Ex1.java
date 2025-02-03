
public class Ex1 {

	public static void main(String[] args) {

		for (int x = 1; x < 11; x++) {
			for (int y = 1; y < 11; y++) {
				System.out.println(x + " and " + y);
			}
		}
		System.out.println("***********************************************");

		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {
				if (i < j) {
					System.out.println(i + " and " + j);
				}
			}
		}
		System.out.println("***********************************************");

		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j <= 8; j++) {
				System.out.println(i + " and " + j);
			}
		}

	}

}
