
public class Exercise1 {
	
	public static void main(String[] args) {

		   int a = 1000, b = -22;
		   a = 500; 
		   b = 30;
		   // Output: a is NOT less than b
		   // Output: a is greater than b
		   a = 44;
		   b = 54;
		   // Output: a is less than b
		   // Output: a is NOT greater than b
				
		   if (a < b)
		   {
		      System.out.println("a is less than b");
		   }
		   else
		   {
		      System.out.println("a is NOT less than b");
		   }
		   
		   if (a > b) {
			   System.out.println("a is greater than b");
		   } else {
			   System.out.println("a is NOT greater than b");
		   }

	}
	
}
