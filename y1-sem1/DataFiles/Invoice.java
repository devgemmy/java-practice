import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Invoice {

    public static void main(String[] args) {
        Scanner searching = new Scanner(System.in);
        System.out.print("Search for Institution: ");
        String schSearch = searching.nextLine();

        importData("INSTITUTION.csv");

    }

    private static void importData(String filePath) {
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
    private static void parseData(String line) {
        // Parsing logic based on the structure of the CSV file
        String[] values = line.split(",");

        if (values[0].equalsIgnoreCase("University College Birmingham")) {
            // courses.put(values[1], new Course(values[1], values[2],
            // Double.parseDouble(values[3])));
            System.out.println("Institution name: " + values[0]);
        }
        // Add similar logic for invoices, sports, and food
    }

}
