import java.sql.SQLException;
import java.util.Scanner;

public class InsertQ2 {

    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String studName = sc.nextLine();

        System.out.print("Enter your age: ");
        String studAge = sc.nextLine();

        System.out.print("Enter your subject: ");
        String studSubject = sc.nextLine();

        System.out.print("Thank you!");
        sc.close();


        String insert_intoQuery = "INSERT INTO STUDENTS (Name, Age, Subject, UKPRN) VALUES ('" + studName +"', " + studAge + ", '" + studSubject + "', null);";
        ConnectToDB.QueryTheDB(insert_intoQuery);

        UpdateStudent(1000459, "Anthonia");
    }

    // Question 2.1
    public static void UpdateStudent(int ukprn, String name) throws SQLException{
        String updateQuery = "UPDATE Student SET UKPRN = " + ukprn + " WHERE NAME = " + name;
        ConnectToDB.QueryTheDB(updateQuery);
    }

}
