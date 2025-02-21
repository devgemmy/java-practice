package Exercise6;

public class Employee {
    private String name;
    private int hoursWorked;
    private double hourlyRate;

    public Employee(String nm, int pwr, double rate) {
        name = nm;
        hoursWorked = pwr;
        hourlyRate = rate;
    }

    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    public double applyOverTime() {
        return hoursWorked * (hourlyRate * 1.5);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Prada", 35, 35.0);
        Employee e2 = new Employee("James", 70, 22.0);
        Employee e3 = new Employee("John", 45, 55.0);
        Employee e4 = new Employee("Mary", 81, 40.0);
        Employee e5 = new Employee("Bob", 12, 15.0);

        Employee[] employees = {e1, e2, e3, e4, e5};


        for (Employee emp : employees) {
            double salary = 0.0;
            if (emp.hoursWorked > 40) salary = emp.applyOverTime();
            else salary = emp.calculateSalary();

            System.out.println("Name: " + emp.name + "\nSalary: " + salary + "\n................");
        }
    }
}
