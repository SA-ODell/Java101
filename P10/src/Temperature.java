// Temperature.java: Class for Temperature Analysis
// Author: Stephen O'Dell
// Date:   11/05/2017
// Class:  CS164
// Email:  saodell@cs.colostate.edu


import java.text.SimpleDateFormat;
import java.util.Date;

public class Temperature {

    // Instance data
    public Date date;
    public double temperature;
    public double windspeed;
    
    // Class constructor
    // Look at hints in assignment specification
    public Temperature(String dayMonthYear, String hour, double degrees, double speed) {
    		
    	
    }
    
    // Method to create date
    public static Date createDate(String date, String hour) {
		Date returnDate = null;
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy HH:mm");
		String stringDate = date + " " + hour;
		try {
			returnDate = formatter.parse(stringDate);
		} catch (Exception e) {
			System.out.println("Invalid format: " + stringDate);
		}
		return returnDate;
    }

    // Check if date is in interval
    // Look at hints in assignment specification
    public boolean inInterval(Date start, Date end) {
    		return false;
    }
}

