import java.util.Random;

public class Ex3 {

	public static void main(String[] args) {
		Random rand = new Random();

		// Task A
		for (int i = 0; i < 10; ++i) {
			System.out.println(rand.nextInt(100 - (10) + 1) + (10));
		}
		System.out.println();
		System.out.println("******************************************");
		System.out.println();

		// Task B
		for (int i = 0; i < 10; ++i) {
			System.out.println(rand.nextDouble());
		}
		System.out.println();

	}

}
