
public class Classes {

    public static void main(String[] args) {
        House uncleBuilding = new House("Tower", 2500, "Southall, Merrick Road");
        House brunelUni = new House("Huge School Complex", 19600, "Kingston Lane, Uxbridge");

        System.out.println(brunelUni.getLocation());
        System.out.println(uncleBuilding.getType());

        // Syntax errors, Runtime errors and Semantic errors;

        try {
            int x = Integer.parseInt("brief0");
            System.out.println(x);
        } catch (NumberFormatException e) {
            System.out.println("Sorry, I can only convert numbers");
        }

    }

}
