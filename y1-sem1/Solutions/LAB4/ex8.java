import java.io.*;
// import java.text.DecimalFormat;

public class ex8 {

	public static void main(String[] args) throws IOException {

		writefile_a(4, "C:\\Users\\Alaa Marshan\\Desktop\\Ex_6a.txt");
		writefile_b(4, "C:\\Users\\Alaa Marshan\\Desktop\\Ex_6b.txt");

	}

	public static void writefile_a(int n, String filename) throws IOException {

		FileWriter writehandle = new FileWriter(filename);
		BufferedWriter bw = new BufferedWriter(writehandle);

		for (int i = 1; i <= n; i++) {
			bw.write(i + ": " + Math.sqrt(i));
			bw.newLine();
		}

		bw.close();
		writehandle.close();
		System.out.println("Done");
	}

	public static void writefile_b(int n, String filename) throws IOException {

		FileWriter writehandle = new FileWriter(filename);
		BufferedWriter bw = new BufferedWriter(writehandle);

		for (int i = 1; i <= n; i++) {

			double sqrt = Math.sqrt(i);

			String ex = String.format("%1." + i + "f", sqrt);
			bw.write(i + ": " + ex);
			bw.newLine();
		}

		/*
		 * for(int i = 1; i<n; i++) {
		 * String decimal = "%1." + i +"f";
		 * String modified = String.format(i + ": " + decimal , Math.sqrt(i));
		 * bw.write(modified);
		 * bw.newLine();
		 * }
		 */

		bw.close();
		writehandle.close();
		System.out.println("Done");
	}
}
