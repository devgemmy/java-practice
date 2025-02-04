public class Member {

    private String name;
    private int age;

    public Member(String n, int a) {
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String newname) {
        name = newname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newage) {
        age = newage;
    }

    public void printInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("*******************");
    }

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
}
