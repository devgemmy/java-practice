package E1UCRS;

import java.util.Scanner;

public class UniversitySystem {
    public static void main(String[] args) {
        int inputCount;
        Scanner scInput = new Scanner(System.in);
        Student[] brunelStudents = new Student[3];

        for (inputCount = 0; inputCount < brunelStudents.length; inputCount++) {
            System.out.print("Enter name for student " + (inputCount + 1) + ": ");
            String fullName = scInput.nextLine();
            System.out.print("Enter 6-digit student ID of " + fullName + ": ");
            int studentID = scInput.nextInt();
            scInput.nextLine();
            brunelStudents[inputCount] = new Student(fullName, studentID);
        }

        for (inputCount = 0; inputCount < brunelStudents.length; inputCount++) {
            System.out.println("Enter 5 courses for " + brunelStudents[inputCount].name + "(Student " + (inputCount + 1) + "). Type 'Done' to finish adding courses");
            int count = 0;
            while (count < 5) {
                System.out.print("Course " + (count + 1) + ": ");
                String cour = scInput.nextLine();
                if (cour.equalsIgnoreCase("Done")) break;
                brunelStudents[inputCount].registerCourse(cour);
                count++;
                if (count == 5) System.out.println("Course Limit reached for " + brunelStudents[inputCount].name + "\n");
            }
        }

        for (Student bruStud : brunelStudents) {
            bruStud.displayCourses();
        }

        System.out.print("Enter Student Name to drop a course: ");
        String studentName = scInput.nextLine();
        System.out.print("Enter the course to drop: ");
        String courseToDrop = scInput.nextLine();

        for (Student bruStud : brunelStudents) {
            if (bruStud.name.equals(studentName)) {
                bruStud.dropCourse(courseToDrop);
            }
        }

        for (Student bruStud : brunelStudents) {
            bruStud.displayCourses();
        }
    }
}
