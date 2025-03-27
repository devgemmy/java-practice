package Exercise6;

import java.util.Scanner;

public class Employee {
    private String name;
    private int hoursWorked;
    private double hourlyRate;

    public Employee(String nm, int pwr, double rate) {
        this.name = nm;
        this.hoursWorked = pwr;
        this.hourlyRate = rate;
    }

    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    public double applyOverTime() {
        return hoursWorked * (hourlyRate * 1.5);
    }

    static String logSalary(String name, int hoursWorked, double hourlyRate) {
        double salary = 0.0;
        Employee employee = new Employee(name, hoursWorked, hourlyRate);
        if (hoursWorked > 40) salary = employee.applyOverTime();
        else salary = employee.calculateSalary();

        return "Name: " + employee.name + "\nSalary: " + salary + "\n................";
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

        // Add the scanner
        int employeeCount = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter employee name: ");
            String name = sc.nextLine();
            System.out.print("Enter employee hours worked: ");
            int hoursWorked = sc.nextInt();
            System.out.print("Enter employee hourly rate: ");
            double hourlyRate = sc.nextDouble();
            System.out.println(logSalary(name, hoursWorked, hourlyRate));
            employeeCount++;

        } while (employeeCount != employees.length);
    }
}
