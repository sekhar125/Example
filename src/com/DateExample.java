package com;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String date = sdf.format(new Date());
		System.out.println(date); //15/10/2013
*/		
		/*SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		String dateInString = "14-02-2017 10:20:56";
		Date date=null;
		try {
			date = sdf.parse(dateInString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(date); //Tue Aug 31 10:20:56 SGT 1982
*/
		
		/*SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date)); //2013/10/15 16:16:39
*/
		/*Calendar calendar = Calendar.getInstance();
        Date date =  calendar.getTime();
        System.out.println(date);*/
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
        Calendar calendar = new GregorianCalendar(2017,02,14);
        System.out.println(sdf.format(calendar.getTime()));

        

	}

}
