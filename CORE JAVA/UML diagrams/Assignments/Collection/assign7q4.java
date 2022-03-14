import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class assign7q4 {
	public static void main(String[] args) {
		LinkedList<Date> date1 = new LinkedList<Date>();
		Date d=new Date();
		date1.add(d);
		int year=d.getYear();
		int currentYear=year+1900;  
        System.out.println("Current year is : "+currentYear); 
        boolean leap = false;
        if (currentYear % 4 == 0) {
          if (currentYear % 100 == 0) {
            if (currentYear % 400 == 0)
              leap = true;
            else
              leap = false;
          }
          else
            leap = true;
        }
        else
          leap = false;
        if (leap)
          System.out.println("Your date of birth is "+ d+ " and "+currentYear + " is a leap year.");
        else
          System.out.println("Your date of birth is "+d +" and "+ currentYear + " is not a leap year.");
	}
}
