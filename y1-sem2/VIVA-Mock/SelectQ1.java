import java.sql.SQLException;
import java.sql.ResultSet;

public class SelectQ1 {

    public static void main(String[] args) throws SQLException {
        // Question 1
        String selectQuery = "select * from INSTITUTION where PROVURL is NULL;";
        ResultSet provurlResults = ConnectToDB.QueryTheDB(selectQuery);

        while(provurlResults.next()) {
            System.out.println(provurlResults.getString("LEGAL_NAME") + " is " + provurlResults.getString("PROVURL"));
        }

        String removeQuery = "DELETE FROM INSTITUTION WHERE PROVURL is NULL;";
        ConnectToDB.QueryTheDB(removeQuery);
    }

}
