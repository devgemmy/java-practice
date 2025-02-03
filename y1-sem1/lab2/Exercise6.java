
public class Exercise6 {

	public static void main(String[] args) {
		// #Program 1
		String animal = "";
		int case_num = 10;
		int leg_num = 0;
		
		switch (case_num) {
			case 1: {
				animal = "Llama";
				leg_num = 4;
				System.out.println("Program 1: A " + animal + " has " + leg_num + " legs");
				break;
			}
			case 2: {
				animal = "Goat";
				leg_num = 4;
				System.out.println("Program 1: A " + animal + " has " + leg_num + " legs");
				break;
			}
			case 3: {
				animal = "Cobra";
				leg_num = 0;
				System.out.println("Program 1: A " + animal + " has " + leg_num + " legs");
				break;
			}
			case 4: {
				animal = "Baboon";
				leg_num = 2;
				System.out.println("Program 1: A " + animal + " has " + leg_num + " legs");
				break;
			}
			case 5: {
				animal = "Centipede";
				leg_num = 177;
				System.out.println("Program 1: A " + animal + " has " + leg_num + " legs");
				break;
			}
			case 6: {
				animal = "Ocelot";
				leg_num = 4;
				System.out.println("Program 1: An " + animal + " has " + leg_num + " legs");
				break;
			}
			case 7: {
				animal = "Cod";
				leg_num = 0;
				System.out.println("Program 1: A " + animal + " has " + leg_num + " legs");
				break;
			}
			case 8: {
				animal = "Human";
				leg_num = 2;
				System.out.println("Program 1: A " + animal + " has " + leg_num + " legs");
				break;
			}
			case 9: {
				animal = "Tarantula";
				leg_num = 8;
				System.out.println("Program 1: A " + animal + " has " + leg_num + " legs");
				break;
			}
			case 10: {
				animal = "Black Scorpion";
				leg_num = 8;
				System.out.println("Program 1: A " + animal + " has " + leg_num + " legs");
				break;
			}
			case 11: {
				animal = "Octopus";
				leg_num = 8;
				System.out.println("Program 1: An " + animal + " has " + leg_num + " legs");
				break;
			}
			case 12: {
				animal = "Minke Whale";
				leg_num = 0;
				System.out.println("Program 1: A " + animal + " has " + leg_num + " legs");
				break;
			}
			case 13: {
				animal = "Klingon";
				leg_num = 2;
				System.out.println("Program 1: A " + animal + " has " + leg_num + " legs");
			}
			case 14: {
				animal = "Dog";
				leg_num = 4;
				System.out.println("Program 1: A " + animal + " has " + leg_num + " legs");
				break;
			}
			case 15: {
				animal = "Cat";
				leg_num = 4;
				System.out.println("Program 1: A " + animal + " has " + leg_num + " legs");
				break;
			}
			default: 
				leg_num = 0;
				break;
		}
		
		
		// #Program 1
		String animals = "";
	
		switch (leg_num) {
			case 0: {
				animals = "Cobra, Cod, and Minke Whale";
				System.out.println("Program 2: " + animals + " have 0 legs");
				break;
			}
			case 2: {
				animals = "Human, Baboon, and Klingon";
				System.out.println("Program 2: " + animals + " have 2 legs");
				break;
			}
			case 4: {
				animals = "Llama, Goat, Ocelot, Dog and Cat";
				System.out.println("Program 2: " + animals + " have 4 legs");
				break;
			}
			case 8: {
				animals = "Tarantula, Black Scorpion, and Octopus";
				System.out.println("Program 2: " + animals + " have 8 legs");
				break;
			}
			case 177: {
				animals = "Centipede";
				System.out.println("Program 2: Only " + animals + " has 177 legs");
				break;
			}
			default: 
				leg_num = -1;
				break;
		}

	}

}
