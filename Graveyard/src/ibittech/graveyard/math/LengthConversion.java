package ibittech.graveyard.math;

/**
 * Used for more advanced length conversion, simple stuff like kilometers to
 * meters isn't included.
 * Note almost none of these conversions are exact. I got the numbers from
 * <a href="http://www.selectscg.com/customers/conversions/ConversionFormula.aspx#lblLength">here</a>.
 * A lot of working on this was copy-paste, feel free to send a pull request
 * or report if you find anything off.
 * 
 * @author xbony2
 */
public class LengthConversion {

	/**
	 * Converts feet to centimeters.
	 * 
	 * @param fee the length in feet.
	 * @return the length in centimeter.
	 * 
	 * @author xbony2
	 */
	public static double feetToCentimeter(double fee){
		return (fee * 30.48);
	}
	
	/**
	 * Converts feet to meters.
	 * 
	 * @param fee the length in feet.
	 * @return the length in meters.
	 * 
	 * @author xbony2
	 */
	public static double feetToMeter(double fee){
		return (fee * 0.3048);
	}
	
	/**
	 * Converts feet to kilometers.
	 * 
	 * @param fee the length in feet.
	 * @return the length in kilometers.
	 * 
	 * @author xbony2
	 */
	public static double feetToKilometers(double fee){
		return (fee * 0.0003);
	}
	
	/**
	 * Converts meters to feet.
	 * 
	 * @param met the length in meters.
	 * @return the length in feet.
	 * 
	 * @author xbony2
	 */
	public static double meterToFeet(double met){
		return (met / 0.3048);
	}
	
	/**
	 * Converts meters to yard.
	 * 
	 * @param met the length in meters.
	 * @return the length in yard.
	 * 
	 * @author xbony2
	 */
	public static double meterToYard(double met){
		return (met * 1.09361);
	}
	
	/**
	 * Converts meters to mile.
	 * 
	 * @param met the length in meters.
	 * @return the length in mile.
	 * 
	 * @author xbony2
	 */
	public static double meterToMile(double met){
		return (met * 0.00062);
	}
	
	/**
	 * Converts meters to inches.
	 * 
	 * @param met the length in meters.
	 * @return the length in inches.
	 * 
	 * @author xbony2
	 */
	public static double meterToInch(double met){
		return (met * 39.37008);
	}
	
	/**
	 * Converts kilometers to feet.
	 * 
	 * @param met the length in kilometers.
	 * @return the length in feet.
	 * 
	 * @author xbony2
	 */
	public static double kilometerToFeet(double kil){
		return (kil * 3280.83976);
	}
	
	/**
	 * Converts kilometers to yards.
	 * 
	 * @param met the length in kilometers.
	 * @return the length in yards.
	 * 
	 * @author xbony2
	 */
	public static double kilometerToYard(double kil){
		return (kil * 1093.61339);
	}
	
	/**
	 * Converts kilometers to miles.
	 * 
	 * @param met the length in kilometers.
	 * @return the length in miles.
	 * 
	 * @author xbony2
	 */
	public static double kilometerToMile(double kil){
		return (kil * 0.62137);
	}
	
	/**
	 * Converts kilometers to inches.
	 * 
	 * @param met the length in kilometers.
	 * @return the length in inches.
	 * 
	 * @author xbony2
	 */
	public static double kilometerToInch(double kil){
		return (kil * 39370.07874);
	}
	
	/**
	 * Converts miles to centimeters.
	 * 
	 * @param mil the length in miles.
	 * @return the length in centimeters.
	 * 
	 * @author xbony2
	 */
	public static double mileToCentimeter(double mil){
		return (mil * 160934.68839);
	}
	
	/**
	 * Converts miles to meters.
	 * 
	 * @param mil the length in miles.
	 * @return the length in meters.
	 * 
	 * @author xbony2
	 */
	public static double mileToMeters(double mil){
		return (mil * 1609.34688);
	}
	
	/**
	 * Converts miles to feet.
	 * 
	 * @param mil the length in miles.
	 * @return the length in feet.
	 * 
	 * @author xbony2
	 */
	public static double mileToFeet(double mil){
		return (mil * 5280.00925);
	}
	
	/**
	 * Converts miles to yards.
	 * 
	 * @param mil the length in miles.
	 * @return the length in yards.
	 * 
	 * @author xbony2
	 */
	public static double mileToYard(double mil){
		return (mil * 1760.00329);
	}
	
	/**
	 * Converts miles to kilometers.
	 * 
	 * @param mil the length in miles.
	 * @return the length in kilometers.
	 * 
	 * @author xbony2
	 */
	public static double mileToKilometer(double mil){
		return (mil * 1.60935);
	}
	
	/**
	 * Converts miles to inchs.
	 * 
	 * @param mil the length in miles.
	 * @return the length in inchs.
	 * 
	 * @author xbony2
	 */
	public static double mileToInch(double mil){
		return (mil * 63360.11354);
	}
	
	/**
	 * Converts centimeters to inchs.
	 * 
	 * @param cent the length in centimeters.
	 * @return the length in inchs.
	 * 
	 * @author xbony2
	 */
	public static double centimeterToInches(double cent){
		return (cent * 0.3937);
	}
	
	/**
	 * Converts centimeters to feet.
	 * 
	 * @param cent the length in centimeters.
	 * @return the length in feet.
	 * 
	 * @author xbony2
	 */
	public static double centimeterToFeet(double cent){
		return (cent * 0.03281);
	}
	
	/**
	 * Converts centimeters to yards.
	 * 
	 * @param cent the length in centimeters.
	 * @return the length in yards.
	 * 
	 * @author xbony2
	 */
	public static double centimeterToYard(double cent){
		return (cent * 0.01094);
	}
	
	/**
	 * Converts yards to centimeters.
	 * 
	 * @param yar the length in yards.
	 * @return the length in centimeters.
	 * 
	 * @author xbony2
	 */
	public static double yardToCentimeter(double yar){
		return (yar * 91.43999);
	}
	
	/**
	 * Converts yards to meters.
	 * 
	 * @param yar the length in yards.
	 * @return the length in meters.
	 * 
	 * @author xbony2
	 */
	public static double yardToMeter(double yar){
		return (yar * 0.9144);
	}
	
	/**
	 * Converts yards to kilometers.
	 * 
	 * @param yar the length in yards.
	 * @return the length in kilometers.
	 * 
	 * @author xbony2
	 */
	public static double yardToKilometer(double yar){
		return (yar * 0.00091);
	}
	
	/**
	 * Converts yards to miles.
	 * 
	 * @param yar the length in yards.
	 * @return the length in miles.
	 * 
	 * @author xbony2
	 */
	public static double yardToMiles(double yar){
		return (yar * 0.00057);
	}
	
	/**
	 * Converts inches to centimeters.
	 * 
	 * @param inc the length in inches.
	 * @return the length in centimeters.
	 * 
	 * @author xbony2
	 */
	public static double inchToCentimeter(double inc){
		return (inc * 2.54);
	}
	
	/**
	 * Converts inches to meters.
	 * 
	 * @param inc the length in inches.
	 * @return the length in meters.
	 * 
	 * @author xbony2
	 */
	public static double inchToMeter(double inc){
		return (inc * 0.0254);
	}
	
	/**
	 * Converts inches to feet.
	 * 
	 * @param inc the length in inches.
	 * @return the length in feet.
	 * 
	 * @author xbony2
	 */
	public static double inchToFeet(double inc){
		return (inc * 0.08333);
	}
	
	/**
	 * Converts inches to yards.
	 * 
	 * @param inc the length in inches.
	 * @return the length in yards.
	 * 
	 * @author xbony2
	 */
	public static double inchToYard(double inc){
		return (inc * 0.02778);
	}
	
	/**
	 * Converts inches to kilometers.
	 * 
	 * @param inc the length in inches.
	 * @return the length in kilometers.
	 * 
	 * @author xbony2
	 */
	public static double inchToKilometer(double inc){
		return (inc * 0.00003);
	}
	
	/**
	 * Converts inches to miles.
	 * 
	 * @param inc the length in inches.
	 * @return the length in miles.
	 * 
	 * @author xbony2
	 */
	public static double inchToMile(double inc){
		return (inc * 0.00002);
	}
}
