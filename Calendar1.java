/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    int debugDaysCounter = 0; 
	    int sundayStartsMonth = 0;
	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition 
	 	while (year < 2000) {
	 		if (dayOfWeek == 1 && dayOfMonth == 1)
	 			sundayStartsMonth++;
	 		if (dayOfWeek == 1){
	 			System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
	 		} else 
	 		     System.out.println(dayOfMonth + "/" + month + "/" + year);	
	 		advance();
	 		debugDaysCounter++;
	 		if (debugDaysCounter == 36600) { 
	 			System.out.println("During the 20th century, " + sundayStartsMonth +" Sundays fell on the first day of the month");
	 			break;
	 		}
        }
        System.out.println();
        System.out.println("During the 20th century, " + sundayStartsMonth +" Sundays fell on the first day of the month");
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
