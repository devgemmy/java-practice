import java.io.*;

public class FilesHandling {

    public static void main(String[] args) throws IOException {
        // LIFO
        FileWriter handler = new FileWriter("/Users/macbookpro/file.txt");
        BufferedWriter bufwtr = new BufferedWriter(handler);

        bufwtr.write("Rerun program");
        bufwtr.newLine();
        bufwtr.write("Done");

        for (int y = 0; y < 10; y++) {
            bufwtr.write("Hello" + y * 2);
            bufwtr.newLine();
        }

        bufwtr.close();
        handler.close();

        // ========================

        FileReader fileHandler = new FileReader("/Users/macbookpro/reading.txt");
        BufferedReader reader = new BufferedReader(fileHandler);

        String line = null;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        System.out.println(divide(1, 0));

        reader.close();
        fileHandler.close();
    }

    public static int divide(int x, int y) {
        int result = -1;
        System.out.println("Computing division...");

        try {
            result = x / y;
        } catch (ArithmeticException e) {
            System.out.println("Exception: division by zero");
        } finally {
            if (result != -1) {
                System.out.println("Finally the block executes");
                System.out.println("Result: " + result);
            } else {
                System.out.println("Finally the block executes. Execution Occurred");
                return result;
            }
        }

        return result;
    }

}
