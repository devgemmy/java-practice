import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class question6 {

    public static void main(String[] args) throws IOException {
        FileWriter writeHandleFile = new FileWriter("/Users/macbookair/mockexam_question6.txt");
        BufferedWriter bufWrite = new BufferedWriter(writeHandleFile);

        for (int a = 1; a <= 10; a++) {
            String line = String.valueOf((a * a) + 2);

            // if(a == 10) System.out.print(line + ".");
            // else System.out.print(line + ", ");

            bufWrite.write(line);
            bufWrite.newLine();
        }

        bufWrite.close();
        writeHandleFile.close();

        // System.out.println("=====================");

        FileReader readHandleFile = new FileReader("/Users/macbookair/mockexam_question6.txt");
        BufferedReader bufRead = new BufferedReader(readHandleFile);

        String lines = null;

        while ((lines = bufRead.readLine()) != null) {
            System.out.println(lines);
        }

        bufRead.close();
        readHandleFile.close();

    }

}
