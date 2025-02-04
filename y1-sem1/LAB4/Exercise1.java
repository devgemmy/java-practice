
public class Exercise1 {

    public static void main(String[] args) {
        System.out.println("Lab 4 - Exercise 1 \n");

        double[] students = { 170.0, 162.5, 145.2, 189.5, 191.6, 156.3, 168.5, 174.0, 152.7, 172.4 };

        // a) length
        System.out.println(students.length);

        // b) values
        for (int i = 0; i < students.length; i++) {
            if (i == students.length - 1)
                System.out.print(students[i]);
            else
                System.out.print(students[i] + ", ");
        }

        // c) average
        double total = 0.0;
        for (int i = 0; i < students.length; i++) {
            total += students[i];
        }
        double average = total / students.length;
        System.out.println("\n" + average);

        // d) minimum
        double min = students[0];
        for (int i = 0; i < students.length; i++) {
            double x = students[i];
            if (x < min)
                min = x;
        }
        System.out.println("\nThe minimum height is: " + min);

        // e) max
        double max = students[0];
        for (int i = 0; i < students.length; i++) {
            double x = students[i];
            if (x > max)
                max = x;
        }
        System.out.println("The maximum height is: " + max);
    }

}
