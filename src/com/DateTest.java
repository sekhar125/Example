package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*try {
			String pattern = "dd.MM.yyyy";
		    SimpleDateFormat format = new SimpleDateFormat(pattern);
		      
		      Date policyStartTau = format.parse("01.01.2015");
		      String startdate="01.11.2018";
		      Date date1 = format.parse(startdate);
		      System.out.print(policyStartTau.compareTo(date1));
		      System.out.print(date1.compareTo(policyStartTau));
		    	Date sysDate=format.parse("16.05.2017");
		    	Date policyEndDate= format.parse("15.05.2017");
		    	int dateCount=sysDate.compareTo(policyEndDate);
		    	if(dateCount<=0)
		    	System.out.print("Running");
		    	else
			    	System.out.print("Expired");
		      
		    } catch (ParseException e) {
		      e.printStackTrace();
		    }*/
		/*Date newDate = new Date();
		newDate.setDate(newDate.getDate()+1);
		System.out.println(newDate);
*/
		SimpleDateFormat dateFormat = new SimpleDateFormat( "yyyy-MM-dd" );
		Date day=null;
		try {
			day = dateFormat.parse("2017-07-21");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// add the day
		Date dayAfter = new Date(day.getTime() + TimeUnit.DAYS.toMillis(1));
		System.out.print(dayAfter.toString());



	}

}
