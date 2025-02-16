
public class ArrayExercise {

    public static void main(String[] args) {
        // Java Arrays Exercises

        char[] grades = new char[5];

        grades[0] = 'A';
        grades[1] = 'C';
        grades[2] = 'C';
        grades[3] = 'A';
        grades[4] = 'B';

        char cs1001 = grades[0], cs1005 = grades[4];

        System.out.println(cs1001 + ", " + cs1005);
        System.out.println(grades.length);

        int[] myNums = new int[20];
        System.out.println(myNums.length);

        String[] theTonneaus = { "Dieumabeni", "Sagesse", "Salouange", "Sosipater", "Cheradieu", "Cadeauceleste" };
        System.out.println(theTonneaus[4]);

        char[] grades_2 = { 'A', 'C', 'D', 'C', 'B' };

        System.out.println(grades_2[2]);

        String[] theFirstSix = theTonneaus;
        System.out.println(theFirstSix[0]);

        int[] squaresOfNums = new int[10];

        for (int i = 0; i < squaresOfNums.length; i++) {
            squaresOfNums[i] = (i + 1) * (i + 1);
            // System.out.println(squaresOfNums[i]);
        }

        String[][] tonneauNames = { { "Ronnelle", "Dieumabeni", "Ranyerechi" },
                { "Esmeraude", "Sagesse", "Jamal" },
                { "Souci", "Salouage", "Jeneta" }
        };
        System.out.println(tonneauNames[2][0]);

        int[][] fours = new int[4][4];

        for (int i = 0; i < fours.length; i++) {
            for (int j = 0; j < fours.length; j++) {
                fours[i][j] = i + j;
            }
        }
        System.out.println(fours[3][2]);

        // Array copying and Array manipulation
        // System.arraycopy(fours, 2, grades_2, 0, 5);
    }
}
