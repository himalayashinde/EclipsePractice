package DateClassExample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date= new Date();
		
		SimpleDateFormat sdf= new SimpleDateFormat("MM/DD/YYYY");
		SimpleDateFormat sd= new SimpleDateFormat("MM/DD/YYYY hh:mm:ss");
		System.out.println(sdf.format(date));
		System.out.println(sd.format(date));
		
		System.out.println(date.toString());
	}

}
