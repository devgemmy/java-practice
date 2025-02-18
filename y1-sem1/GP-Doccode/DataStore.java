import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataStore {
    private List<Invoice> invoices; // All invoice records
    private Map<String, Course> courses; // Course data
    private Map<String, Sport> sports; // Sports activities data
    private Map<String, Food> foods; // Food items data
    private List<Institution> institutions; // Institution data

    // Constructor
    public DataStore() {
        invoices = new ArrayList<>();
        courses = new HashMap<>();
        sports = new HashMap<>();
        foods = new HashMap<>();
        institutions = new ArrayList<>();
    }

    // Getter and Setter methods
    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    public Map<String, Course> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, Course> courses) {
        this.courses = courses;
    }

    public Map<String, Sport> getSportActivity() {
        return sports;
    }

    public void setSportActivity(Map<String, Sport> sports) {
        this.sports = sports;
    }

    public Map<String, Food> getFoodItems() {
        return foods;
    }

    public void setFoodItems(Map<String, Food> foods) {
        this.foods = foods;
    }

    public List<Institution> getInstitutions() {
        return institutions;
    }

    public void setInstitutions(List<Institution> institutions) {
        this.institutions = institutions;
    }

}
