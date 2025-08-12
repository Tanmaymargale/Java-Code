// import java.util.Date;

import java.util.Calendar;

public class DateClass 
{
  public static void main(String args[])
  {
    // Date d = new Date();
    // System.out.println(d.toString());
    Calendar cal = Calendar.getInstance();
    System.out.println(cal.getWeekYear());
    System.out.println(cal.getTime());
  }  
}
