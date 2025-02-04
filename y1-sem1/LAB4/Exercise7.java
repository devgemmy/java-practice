import java.io.*;

public class Exercise7 {

    public static void main(String[] args) throws IOException {
        System.out.println("Lab 4 - Exercise 7 \n");

        FileReader readingHandle = new FileReader("/Users/macbookair/the art of flying.txt");
        BufferedReader bufread = new BufferedReader(readingHandle);

        String line = null;
        while ((line = bufread.readLine()) != null) {
            String[] wordCount = line.split(" ");
            System.out.println("The text in Appendix A contains " + wordCount.length + " words");
        }

        bufread.close();
        readingHandle.close();
    }
}
