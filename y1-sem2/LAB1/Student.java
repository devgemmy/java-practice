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
        return avgScore = (double) scoreSum / 3;
    }

    public char[] determineGrade() {
        char[] testGrades = new char[testScores.length];
        for (int scr = 0; scr < testScores.length; scr++) {
            if (testScores[scr] >= 90) {
                testGrades[scr] = 'A';
            } else if (testScores[scr] >= 80 && testScores[scr] <= 89) {
                testGrades[scr] = 'B';
            } else if (testScores[scr] >= 70 && testScores[scr] <= 79) {
                testGrades[scr] = 'C';
            } else if (testScores[scr] >= 60 && testScores[scr] <= 69) {
                testGrades[scr] = 'D';
            } else if (testScores[scr] <= 59) {
                testGrades[scr] = 'F';
            } else if (testScores[scr] > 100) {
                testGrades[scr] = '-';
                System.out.println("Error: Your grade is out of range.");
            }
        }
        return testGrades;
    }

    public static void main(String[] args) {
        int[] arrOfScores = new int[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arrOfScores.length; i++) {
            System.out.print("Enter your test score" + (i + 1) + ": ");
            arrOfScores[i] = sc.nextInt();
        }

        Student s1 = new Student("Zipora", arrOfScores);
        double s1_avgScore = s1.calculateAverage();
        System.out.println(s1_avgScore);

        char[] s1_grades = s1.determineGrade();
        for (char grd : s1_grades) {
            System.out.println(grd);
        }
    }
}
