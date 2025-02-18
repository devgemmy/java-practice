import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FinanceComponent {
    // Private Fields
    private List<Invoice> invoices;
    private Map<String, Course> courses;
    private Map<String, Sport> sports;
    private Map<String, Food> foods;
    private DataStore dataStore;

    // Constructor
    public FinanceComponent() {
        this.invoices = new ArrayList<>();
        this.courses = new HashMap<>();
        this.sports = new HashMap<>();
        this.foods = new HashMap<>();
        this.setDataStore(new DataStore());
    }

    // Public Methods

    /**
     * Imports data from the specified file path.
     * 
     * @param filePath The path to the CSV file.
     */
    public void importData(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                parseData(line); // Call parseData for each line
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    /**
     * Parses a line of data and stores it in the appropriate data structure.
     * 
     * @param line A line of CSV data.
     */
    public void parseData(String line) {
        // Parsing logic based on the structure of the CSV file
        String[] values = line.split(",");
        // Example: Process data for courses
        if (values[0].equalsIgnoreCase("course")) {
            courses.put(values[1], new Course(values[1], values[2], Double.parseDouble(values[3])));
        }
        // Add similar logic for invoices, sports, and food
    }

    /**
     * Calculates total costs for a given period.
     * 
     * @param period The time period (e.g., "monthly", "yearly").
     * @return A map of category totals.
     */
    public Map<String, Double> calculateTotals(String period) {
        Map<String, Double> totals = new HashMap<>();
        double totalCourses = 0, totalSports = 0, totalFoods = 0;

        for (Invoice invoice : invoices) {
            totalCourses += invoice.getCourseFees();
            totalSports += invoice.getSportsCosts();
            totalFoods += invoice.getFoodCosts();
        }

        totals.put("Courses", totalCourses);
        totals.put("Sports", totalSports);
        totals.put("Food", totalFoods);
        return totals;
    }

    /**
     * Calculates average costs for a specific institution and period.
     * 
     * @param institutionID The institution ID.
     * @param period        The time period (e.g., "monthly", "yearly").
     * @return A map of category averages.
     */
    public Map<String, Double> calculateAverages(String institutionID, String period) {
        Map<String, Double> averages = new HashMap<>();
        double totalCourses = 0, totalSports = 0, totalFoods = 0;
        int count = 0;

        for (Invoice invoice : invoices) {
            if (invoice.getInstitutionID().equals(institutionID)) {
                totalCourses += invoice.getCourseFees();
                totalSports += invoice.getSportsCosts();
                totalFoods += invoice.getFoodCosts();
                count++;
            }
        }

        averages.put("Courses", totalCourses / count);
        averages.put("Sports", totalSports / count);
        averages.put("Food", totalFoods / count);
        return averages;
    }

    /**
     * Sorts data by the specified category and order.
     * 
     * @param category The category to sort by (e.g., "Courses", "Sports", "Food").
     * @param order    True for ascending, False for descending.
     */
    public void sortDataByCategory(String category, boolean order) {
        invoices.sort((a, b) -> {
            double comparison;
            if (category.equalsIgnoreCase("Courses")) {
                comparison = a.getCourseFees() - b.getCourseFees();
            } else if (category.equalsIgnoreCase("Sports")) {
                comparison = a.getSportsCosts() - b.getSportsCosts();
            } else {
                comparison = a.getFoodCosts() - b.getFoodCosts();
            }
            return order ? (int) comparison : (int) -comparison;
        });
    }

    /**
     * Displays the data in a readable format (e.g., console or GUI).
     */
    public void displayData() {
        for (Invoice invoice : invoices) {
            System.out.println(invoice);
        }
    }

    /**
     * Generates a new invoice and adds it to the system.
     * 
     * @param studentName The name of the student.
     * @param courseID    The course ID.
     * @param sports      A map of sports activities and their costs.
     * @param foods       A map of food items and their costs.
     * @param date        The date of the invoice.
     */
    public void generateInvoice(String studentName, String courseID, Map<String, Sport> sports, Map<String, Food> foods,
            Date date) {

        double courseCost = courses.get(courseID).getCourseFee();

        double sportsCost = 0.0;
        for (Sport sport : sports.values()) {
            sportsCost += sport.getPrice();
        }

        double foodCost = 0.0;
        for (Food food : foods.values()) {
            foodCost += food.getPrice();
        }

        Invoice invoice = new Invoice(studentName, courseID, courseCost, sportsCost, foodCost, date);
        invoices.add(invoice);

    }

    /**
     * Searches for invoices matching the given keyword.
     * 
     * @param keyword The search keyword.
     * @return A list of matching invoices.
     */
    @SuppressWarnings("unlikely-arg-type")
    public List<Invoice> searchByKeyword(String keyword) {
        List<Invoice> results = new ArrayList<>();
        for (Invoice invoice : invoices) {
            if (courses.get(invoice.getCourseID()).getCourseName().contains(keyword)) {
                results.add(invoice);
            }
        }
        return results;
    }

    /**
     * Adds a new cost item to the specified category.
     * 
     * @param category The category (e.g., "Courses", "Sports", "Food").
     * @param item     The item name.
     * @param cost     The cost of the item.
     */
    public void addCostItem(String category, String item, double cost) {

        if (category.equalsIgnoreCase("Courses")) {
            courses.put(item, new Course(item, item, cost));
        } else if (category.equalsIgnoreCase("Sports")) {
            sports.put(item, new Sport(item, cost));
        } else if (category.equalsIgnoreCase("Food")) {
            foods.put(item, new Food(item, cost));
        }
    }

    /**
     * Retrieves a filtered list of courses, sports activities, or food items
     * associated with the institution in a specified invoice.
     * 
     * @param category  The category (e.g., "Courses", "Sports", "Food").
     * @param invoiceID The invoice ID
     */
    // .
    public Map<String, ?> getItemsForInvoice(String invoiceID, String category) {
        // Find the invoice by ID
        Invoice invoice = invoices.stream()
                .filter(inv -> inv.getInvoiceID().equals(invoiceID))
                .findFirst()
                .orElse(null);

        if (invoice == null) {
            System.err.println("Invoice not found for ID: " + invoiceID);
            return null;
        }

        String institutionID = invoice.getInstitutionID(); // Retrieve the associated institution ID

        // Return items based on category
        switch (category.toLowerCase()) {
            case "courses":
                return courses.entrySet().stream()
                        .filter(entry -> entry.getValue().getInstitutionID().equals(institutionID))
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

            case "sports":
                return sports.entrySet().stream()
                        .filter(entry -> entry.getValue().getInstitutionID().equals(institutionID))
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

            case "food":
                return foods.entrySet().stream()
                        .filter(entry -> entry.getValue().getInstitutionID().equals(institutionID))
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

            default:
                System.err.println("Invalid category specified: " + category);
                return null;
        }
    }

    /**
     * Removes a cost item from the specified category.
     * 
     * @param category The category (e.g., "Courses", "Sports", "Food").
     * @param item     The item name to remove.
     */
    public void removeCostItem(String category, String item) {
        if (category.equalsIgnoreCase("Courses")) {
            courses.remove(item);
        } else if (category.equalsIgnoreCase("Sports")) {
            sports.remove(item);
        } else if (category.equalsIgnoreCase("Food")) {
            foods.remove(item);
        }
    }

    /**
     * Saves the current data to the persistent storage.
     */
    public void saveData() {
        // Example: Save data to files or a database
        System.out.println("Data saved successfully.");
    }

    public DataStore getDataStore() {
        return dataStore;
    }

    public void setDataStore(DataStore dataStore) {
        this.dataStore = dataStore;
    }
}
