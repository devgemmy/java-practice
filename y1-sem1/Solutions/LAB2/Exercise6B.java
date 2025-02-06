
public class Exercise6B {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String animal_name;

        int leg_num = 250;

        switch (leg_num)

        {

            case 4: {

                animal_name = "goat,baboon and ocelot";

                System.out.println("a(n) " + animal_name + " has " + leg_num + " legs. ");

                break;
            }

            case 2: {
                animal_name = "human, lela and klingon";

                System.out.println("a(n) " + animal_name + " has " + leg_num + " legs. ");

                break;
            }

            case 0: {
                animal_name = "cobra, cod and minke whale";

                System.out.println("a(n) " + animal_name + " has " + leg_num + " legs. ");

                break;
            }

            case 8: {
                animal_name = "trantula, black scorpion and german octopus";

                System.out.println("a(n) " + animal_name + " has " + leg_num + " legs. ");

                break;
            }

            default: {

                System.out.println("No animal found with that number of legs.");

                break;
            }
        }

    }

}
