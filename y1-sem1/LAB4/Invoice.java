
public class Invoice {
    private String invoiceID;
    private String studentName;
    private String courseID;
    private double courseFees;

    public Invoice(String invID, String stuN, String cID, double cFee) {
        invoiceID = invID;
        studentName = stuN;
        courseID = cID;
        courseFees = cFee;
    }

    public void setInvoiceID(String invID) {
        invoiceID = invID;
    }

    public String getInvoiceID() {
        return invoiceID;
    }
}
