package E1UCRS;

import java.util.ArrayList;

public class Student {
    public String name;
    private int studentID;
    protected String[] registeredCourses;
    private int cc;

    public Student(String nm, int id) {
        this.name = nm;
        this.studentID = id;
        this.registeredCourses = new String[5];
        this.cc = 0;
    }

    public void registerCourse(String course) {
        if (cc < 5) {
            registeredCourses[cc] = course;
            cc++;
        }
    }

    void dropCourse(String course) {
        for(int i = 0; i < cc; i++) {
            if (registeredCourses[i].equalsIgnoreCase(course) && registeredCourses[i] != null) {
                registeredCourses[i] = null;
                System.out.println(name + "dropped " + course);
                break;
            }
        }
        System.out.println("ERROR: " + course + " not found in " + name + "'s registered courses.");

    }

    public void displayCourses() {
        System.out.println(name + "'s registered courses: ");
        for (String regCourses : registeredCourses) {
            if (regCourses != null) {
                System.out.println("- " + regCourses);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {}
}

/*
from registerCourses function:

do {
    if (registeredCourses[cc] != course && registeredCourses[i] != null) {
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
if (registeredCourses[registeredCourses.length - 1] != null) System.out.println("");
*/