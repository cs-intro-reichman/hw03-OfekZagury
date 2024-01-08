
public class Calendar {	
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     
	static int nDaysInMonth = 31; 
	
	public static void main(String args[]) {
		int selectedYear = Integer.parseInt(args[0]);
		while (year < selectedYear){
			advance();
		}
	 	while (year == selectedYear) {
	 		if (dayOfWeek == 1){
	 			System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
	 		} else 
	 		     System.out.println(dayOfMonth + "/" + month + "/" + year);	
	 		advance();
        }
	 }
	 private static void advance() {
	 	dayOfWeek++;
	 	dayOfMonth++;
	 	if (dayOfWeek > 7)
	 		dayOfWeek = 1;

	 	if (dayOfMonth > nDaysInMonth(month, year)) {
	 		month++;
	 		dayOfMonth = 1;
	 	}

	 	if (month > 12) {
	 		month = 1;
	 		year++ ;
	 	}
	 } 
	private static boolean isLeapYear(int year) {
		boolean isLeapYear = false;
		isLeapYear = (year % 400 == 0);
		isLeapYear = isLeapYear || (year % 4 == 0 && year % 100 != 0);
		return isLeapYear;
	}
	private static int nDaysInMonth(int month, int year) {
		        if ((month == 2) && isLeapYear(year)) {
        	return 29;
        } else if ((month == 2) && !isLeapYear(year)) {
        	return 28;
          } else if (month == 4 || month == 6 || month == 9 || month == 11) {
			  return 30;
		    } else {
			    return 31;
		} 
	}
}
