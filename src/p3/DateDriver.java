package p3;

/**
 * <h1>Date Driver</h1><br />
 * 
 * <b>Description</b><br />
  * Takes in a date as day, month, year and returns information relating 
 * to the input date and the current date.
 * <br /><br />
 * If the input date is invalid then the date will be set to the current date.
 * <br /><br />
 * This class is essentially a test class for the DateAD class
 * 
 * @author Jens Bodal
 * @version 1.0
 * 
 * Compiler Java 1.7 OS: Windows 7, OSX Hardware: PC
 * 
 * November 11, 2013 JB Completed v1.0
 */
public class DateDriver {

    /**
     * Date Driver class essentially tests the DateAD class.  The main method
     * calls for user input and returns the following information: <br />
     * <ul>
     * <li></li>
     * </ul>
     * 
     * @param args takes in 1, 2, or 3 arguments as day; day, month; 
     * day, month, year; e.g. 2 1 2000 == January 1, 2000
     */
    public static void main(String[] args) {
        DateAD today = new DateAD();
        DateAD currentDate = new DateAD();
        
        if (args.length == 1) {
            currentDate = new DateAD(
                    Short.parseShort(args[0]));    
        }
        if (args.length == 2) {
            currentDate = new DateAD(
                    Short.parseShort(args[0]),
                    Short.parseShort(args[1]));
        }
        if (args.length == 3) {
            currentDate = new DateAD(
                    Short.parseShort(args[0]),
                    Short.parseShort(args[1]),
                    Short.parseShort(args[2]));
        }

        System.out.printf("The date is: %s%n", currentDate);
        System.out.printf("The day before is: %s%n", 
                currentDate.getYesterday(currentDate));
        System.out.printf("The day after is: %s%n", 
                currentDate.getTomorrow(currentDate));
        System.out.printf("Today is: %s%n", today);

        System.out.printf("%s is %s%n", currentDate, 
                currentDate.compare(today));

    } //End main method

}//End DateDriver Class
