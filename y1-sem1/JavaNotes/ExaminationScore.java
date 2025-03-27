class MidTerm {
    double midScore = 93;

    static class Exam {
        double examScore = 72;
        double finalScore;
    }
}

public class ExaminationScore {
    public static void main(String[] args) {
        MidTerm myMidTermExam = new MidTerm();
        MidTerm.Exam myFinalExam = new MidTerm.Exam();
        myFinalExam.finalScore =
                (myFinalExam.examScore * 70/100) + (myMidTermExam.midScore * 30/100);
        System.out.println(myFinalExam.finalScore);

    }
}