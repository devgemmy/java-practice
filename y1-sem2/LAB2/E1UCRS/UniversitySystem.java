package E1UCRS;

import java.util.Scanner;

public class UniversitySystem {
    public static void main(String[] args) {
        Student[] brunelStudents = new Student[3];

        Scanner input = new Scanner(System.in);
        System.out.println("Type 'Finish' to exit the program. Type 'Done' to finish adding courses.");

        while (true) {
            if (input.nextLine().equalsIgnoreCase("finish")) {
                break;
            } else {
                System.out.print("Enter your full name: ");
                String fullName = input.nextLine();

                System.out.print("Enter your student ID: ");
                int studentID = input.nextInt();

                System.out.print("How many courses are you taking? : ");
                int courseAmount = input.nextInt();

                System.out.print("Enter your courses: ");

                while (true) {
                    if (input.nextLine().equalsIgnoreCase("done")) {
                        break;
                    } else {
                        Student sDetails = new Student(fullName, studentID, courseAmount);
                        sDetails.registerCourse(input.nextLine());
                    }
                }
            }
        }
    }
}
