package p3;

/**
 *
 * @author Jens Bodal
 */
public class DateDriver {

    /**
     * @param args the command line arguments
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
