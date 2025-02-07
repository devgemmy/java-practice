
public class Dog {
    // Instance variables
    private String name;
    private String breed;
    private int age;

    // Constructor
    public Dog(String name, String breed, int age) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // Getters
    public void bark() {
        System.out.println("Woof!");
    }
}
