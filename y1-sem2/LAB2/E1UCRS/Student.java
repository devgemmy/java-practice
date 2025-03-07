package E1UCRS;

import java.util.ArrayList;

public class Student {
    public String name;
    private final int studentID;
    protected static String[] registeredCourses;

    public Student(String nm, int id, int studentID) {
        name = nm;
        this.studentID = studentID;
        registeredCourses = new String[5];
    }

    public void registerCourse(String course) {
        if (registeredCourses.length < 5) registeredCourses[registeredCourses.length - 1] = course;
        else System.out.println("ERROR: Course Limit reached.");
    }

    public static void main(String[] args) {
         // courseList = new[];
    }

    void dropCourse() {

    }
}
