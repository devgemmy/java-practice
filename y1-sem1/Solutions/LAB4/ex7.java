
import java.io.*;

public class ex7 {

	public static void main(String[] args) throws IOException {

		FileReader readhandle = new FileReader("C:\\Users\\Alaa Marshan\\Desktop\\the art of flying.txt");
		BufferedReader BR = new BufferedReader(readhandle);

		String line;
		int countwords = 0;
		while ((line = BR.readLine()) != null) {
			String[] wordList = line.split(" ");
			countwords = wordList.length;
		}

		System.out.println("Word count = " + countwords);

		BR.close();
		readhandle.close();
	}

}
