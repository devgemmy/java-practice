import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectToDB {
    public static void main(String args[]) throws SQLException {
        String createDBQuery = "CREATE TABLE STUDENTS (Name TEXT, Age INTEGER, Subject TEXT, UKPRN TEXT);";
        QueryTheDB(createDBQuery);
    }

    public static ResultSet QueryTheDB(String query) throws SQLException {
        Connection conn = null;
        String driver = "jdbc:sqlite", db = "/Users/macbookair/Documents/BRUNEL/YEAR 1/Group Project B/UMS-DB.db";
        String url = driver + ":" + db;

        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Connected to SQL DB successfully.");
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }

        PreparedStatement sqlStatement = conn.prepareStatement(query);
        ResultSet results = sqlStatement.executeQuery();

        return results;
    }
}
