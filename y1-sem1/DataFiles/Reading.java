import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Reading {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner searching = new Scanner(System.in);
        System.out.print("Search for Institution: ");
        String schSearch = searching.nextLine();

        importData("INSTITUTION.csv");

        searchSchool(schSearch);

    }

    private static void searchSchool(String search) throws FileNotFoundException {
        File uni = new File("INSTITUTION.csv");
        // System.out.println(uni.canRead());
        Scanner uniscan = new Scanner(uni);

        // String search = "Burnley School";

        while (uniscan.hasNext()) {
            // System.out.println(uniscan.nextLine());
            String[] cols = uniscan.nextLine().split(",");

            String UNI = cols[0];
            String UNI_ID = cols[4];

            if (UNI.toLowerCase().equals(search.toLowerCase())) {
                System.out.println(UNI + " " + UNI_ID);
                break;
                // return;
            }

        }

        // System.out.println("Didn't find anything...");

        uniscan.close();

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
        // Example: Process data for courses
        if (values[0].equalsIgnoreCase("University College Birmingham")) {
            // courses.put(values[1], new Course(values[1], values[2],
            // Double.parseDouble(values[3])));
            System.out.println("School name" + values[0]);
        } else {
            System.out.println("All" + values.toString());
        }

        // Add similar logic for invoices, sports, and food
    }

}
