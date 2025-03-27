abstract class Main {
    public String fname = "John";
    public int age = 24;
    public abstract void study(); // abstract method
}

class Student extends Main{
    public int gradYear = 2018;
    public void study() {
        System.out.println("Student study all day long");
    }
}

class NewStudent {
    public static void main(String[] args) {
        Student studentGrad = new Student();

        System.out.println("Grad Year: " + studentGrad.fname);
        System.out.println("Grad Year: " + studentGrad.age);
        System.out.println("Grad Year: " + studentGrad.gradYear);
    }
}
