package Exercise4;

import java.util.Scanner;

public class Student {
    private String name;
    private final int[] testScores;

    public Student(String nm, int[] tscs) {
        name = nm;
        testScores = tscs;
    }

    public double calculateAverage() {
        int scoreSum = 0;
        if (testScores.length != 3) {
            System.out.println("Error: This program can only take 3 test scores.");
        } else {
            for (int score : testScores) {
                scoreSum += score;
            }
        }
        double avgScore;
        avgScore = (double) scoreSum / 3;

        return avgScore;
    }

    public char determineGrade(double avgScore) {
        char grade = '-';
        if (avgScore >= 90 && avgScore <= 100) grade = 'A';
        else if (avgScore >= 80 && avgScore <= 89) grade = 'B';
        else if (avgScore >= 70 && avgScore <= 79) grade = 'C';
        else if (avgScore >= 60 && avgScore <= 69) grade = 'D';
        else if (avgScore <= 59) grade = 'F';
        else if (avgScore > 100) System.out.println("Error: Your grade is out of range.");

        return grade;
    }

    public static void main(String[] args) {
        int[] arrOfScores = new int[3];
        int[] secArrOfScores = new int[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arrOfScores.length; i++) {
            System.out.print("Enter your test score" + (i + 1) + ": ");
            arrOfScores[i] = sc.nextInt();
        }

        Student s1 = new Student("Zipora", arrOfScores);
        double s1_avgScore = s1.calculateAverage();

        if (s1_avgScore > 100) System.out.println(s1.name + "'s Average score is" + (Math.round(s1_avgScore * 100.0) / 100.0) + ", which is out of range.");
        else System.out.println(s1.name + "'s Average score: " + (Math.round(s1_avgScore * 100.0) / 100.0) + ", which is " + s1.determineGrade(s1_avgScore));

        for (int j = 0; j < secArrOfScores.length; j++) {
            System.out.print("Enter your test score" + (j + 1) + ": ");
            secArrOfScores[j] = sc.nextInt();
        }

        Student s2 = new Student("Zoey", secArrOfScores);
        double s2_avgScore = s2.calculateAverage();

        if (s2_avgScore > 100) System.out.println(s2.name + "'s Average score is" + (Math.round(s2_avgScore * 100.0) / 100.0) + ", which is out of range.");
        else System.out.println(s2.name + "'s Average score: " + (Math.round(s2_avgScore * 100.0) / 100.0) + ", which is " + s2.determineGrade(s2_avgScore));
    }
}

//    public char[] determineAllGrades() {
//        char[] testGrades = new char[testScores.length];
//        for (int scr = 0; scr < testScores.length; scr++) {
//            if (testScores[scr] >= 90 && testScores[scr] <= 100) {
//                testGrades[scr] = 'A';
//            } else if (testScores[scr] >= 80 && testScores[scr] <= 89) {
//                testGrades[scr] = 'B';
//            } else if (testScores[scr] >= 70 && testScores[scr] <= 79) {
//                testGrades[scr] = 'C';
//            } else if (testScores[scr] >= 60 && testScores[scr] <= 69) {
//                testGrades[scr] = 'D';
//            } else if (testScores[scr] <= 59) {
//                testGrades[scr] = 'F';
//            } else if (testScores[scr] > 100) {
//                testGrades[scr] = '-';
//                System.out.println("Error: Your grade is out of range.");
//            }
//        }
//        return testGrades;
//    }

// char[] s1_grades = s1.determineAllGrades();
// for (int s = 0; s < arrOfScores.length; s++) {
//    System.out.println(arrOfScores[s] + " is an " + s1_grades[s]);
// }