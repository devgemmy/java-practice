
public class Exercise5 {

	public static void main(String[] args) {
		// String month = "";
		int daysinmonth = 0;
		int month_num = 4;
						
		switch (month_num) {
			case 1: case 3: case 5: case 7: case 8: case 10:  case 12:
				// month = "January"; 
				// month = "March";
				// month = "May";
				// month = "July";
				// month = "August";
				// month = "October";
				// month = "December";
				daysinmonth = 31;
				break;
			case 2:
				// month = "February";
				daysinmonth = 29; //Given that it is 2012...
				break;
			case 4: case 6: case 9: case 11:
				// month = "April";
				// month = "June";
				// month = "September";
				// month = "November";
				daysinmonth = 30;
				break;
			default: 
				daysinmonth = 0;
				// month = "(unknown)";
				break;
		}
		
		// System.out.println("Days in month " + month + " = " + daysinmonth);
		System.out.println("Days in month #" + month_num + " = " + daysinmonth);
		// Output: Days in month #15 = 0

	}

}
