import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;

public class Ex6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Task 1
		FileWriter WriteHandle = new FileWriter("C:\\Users\\Alaa Marshan\\Desktop\\Samplefile.txt");
		BufferedWriter BW = new BufferedWriter(WriteHandle); 
		
		for(int i=1; i<=10 ; i++)
		{
			BW.write(String.valueOf((i*i)+2));
			BW.newLine();
		}
		
		BW.close();
		WriteHandle.close();
		
		//Task 2
		FileReader Readhandle = new FileReader("C:\\Users\\Alaa Marshan\\Desktop\\Samplefile.txt");
		BufferedReader  BR  =  new BufferedReader(Readhandle);
		
		String  line  =  null;
		while((line  =  BR.readLine())  !=  null)
		{
			System.out.println(line);
		}

		BR.close(); 
		Readhandle.close();

	}

}
