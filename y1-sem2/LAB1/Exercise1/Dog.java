package Exercise1;

class Dog {
    // Instance variables
    private String name;
    private String breed;
    private int age;

    // Constructor
    public Dog(String nm, String brd, int ag) {
        this.name = nm;
        this.breed = brd;
        this.age = ag;
    }

    public void bark() {
        System.out.println("Woof!");
    }
}

