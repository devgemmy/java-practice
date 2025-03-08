package E1UCRS;

import java.util.ArrayList;

public class Student {
    public String name;
    private int studentID;
    protected static String[] registeredCourses;

    public Student(String nm, int id, int studentID) {
        name = nm;
        this.studentID = studentID;
        registeredCourses = new String[5];
    }

    public void registerCourse(String course) {
        int i = 0;
        do {
            if (registeredCourses[i] != course && registeredCourses[i] != null) {
                registeredCourses[i+1] = course;
            } else {
                registeredCourses[i] = course;
                System.out.println("Course has been registered.\nPlease enter another one.");
                break;
            }
            i++;
        }
        while(!course.equals(registeredCourses[i]));

        for (String registeredC : registeredCourses) {
            System.out.println(registeredC);
        }

        if (registeredCourses[registeredCourses.length - 1] != null) System.out.println("ERROR: Course Limit reached.");
    }

    void dropCourse(String course) {
        for(int i = 0; i < registeredCourses.length; i++) {
            if (registeredCourses[i].equalsIgnoreCase(course)) {
                registeredCourses[i] = null;
            }
        }
    }

    public static void main(String[] args) {}
}
