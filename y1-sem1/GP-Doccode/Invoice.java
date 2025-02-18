import java.sql.Date;
import java.util.List;

/*

-studentName: String
-courseID: String
-courseFee: double 
-sportsCost: double
-foodCost: double
-date: Date 

+public Invoice(String studentName, String courseID, double courseFee, double sportsCost, double foodCost, Date date)

+getCourseFees(): double
+getSportsCosts(): double
+getFoodCosts(): double
+getInstitutionID(): String
+getStudentName(): List<Invoice>
+getCourseID(): Object
+getInvoiceID(): Object
 
*/

public class Invoice {

    public Invoice(String studentName, String courseID, double courseFee, double sportsCost, double foodCost,
            Date date) {

    }

    public static void main(String[] args) {

    }

    public double getCourseFees() {
        return 0;
    }

    public double getSportsCosts() {
        return 0;
    }

    public double getFoodCosts() {
        return 0;
    }

    public String getInstitutionID() {
        return null;
    }

    public List<Invoice> getStudentName() {
        return null;
    }

    public Object getCourseID() {
        return null;
    }

    public Object getInvoiceID() {
        return null;
    }

}
