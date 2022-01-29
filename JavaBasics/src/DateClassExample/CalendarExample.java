package DateClassExample;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal=Calendar.getInstance();
		//Date d = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("MM/DD/YYYY hh:mm:ss");
		
		System.out.println(sd.format(cal.getTime())); 
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(Calendar.AM_PM));
		
	}

}
