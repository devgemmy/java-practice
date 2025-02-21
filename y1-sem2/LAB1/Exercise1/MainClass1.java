package Exercise1;

public class MainClass1 {
    public static void main(String[] args) {

        Dog bigdog = new Dog("Larry", "Golden Retriever", 5);
        Dog smalldog = new Dog("James", "Chihuahua", 2);

        bigdog.bark();
        smalldog.bark();

    }
}