
public class Exercise10 {

    public static void main(String[] args) {
        System.out.println("Lab 4 - Exercise 10 \n");

        // Class declaration modifier is public, and the name is Member

        /*
         * Field declarations
         * modifier is private, the data type is String, and the name is name.
         * modifier is private, the data type is int (integer), and the name is age.
         */

        // Constructor name is Member, it should have the same name as the class.

        // List of getters (modifier, return type, name, parameters)
        /*
         * modifier is public, the return type is String, the name is getName, and there
         * are no parameters.
         * modifier is public, the return type is int (integer), the name is getAge, and
         * there are no parameters.
         */

        // List of setters (modifier, return type, name, parameters)
        /*
         * modifier is public, the return type is void, the name is setName, and the
         * parameter declared as a string called newname.
         * modifier is public, the return type is void, the name is setAge, and the
         * parameter declared as a string called newage.
         */

        // List of other methods (modifier, return type, name, parameters)
        /*
         * modifier is public, the return type is void, the name is printInfo, and there
         * are no parameters.
         */

        Invoice inv001 = new Invoice("INV34IT6", "Anthonia Asikpo", "MEDrr453434", 9460.50);
        System.out.println(inv001.getInvoiceID());

    }

}
