import java.io.*;

public class Exercise8 {

    public static void main(String[] args) throws IOException {

        writefile(10, "/Users/macbookair/lab4-exercise8.txt");

    }

    // a) and b)
    public static void writefile(int n, String filename) throws IOException {

        FileWriter writeHandle = new FileWriter(filename);
        BufferedWriter bufwrite = new BufferedWriter(writeHandle);

        for (int i = 1; i <= n; i++) {
            // System.out.println(i + ": " + String.format(i + " = %1$." + i +"f",
            // Math.sqrt(i)));
            String line = i + ": " + String.format(i + "%1$." + i + "f", Math.sqrt(i));
            bufwrite.write(line);
            System.out.println(line);
            bufwrite.newLine();
        }

        bufwrite.close();
        writeHandle.close();
    }

}
