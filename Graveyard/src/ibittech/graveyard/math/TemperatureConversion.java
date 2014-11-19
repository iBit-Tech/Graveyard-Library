package ibittech.graveyard.math;

/**
 * Used for temperature conversion, fahrenheit, celsius, and kelvin supported.
 * Must use doubles or floats.
 * 
 * @author xbony2
 */
public class TemperatureConversion {

	/**
	 * Converts fahrenheit to celsius.
	 * @param fah the temperature in fahrenheit.
	 * @return the temperature in celsius.
	 * 
	 * @author xbony2
	 */
	public static double fahrenheitToCelsius(double fah){
		fah =- 32;
		fah = fah * (5/9);
		return fah;
	}
	
	/**
	 * Converts fahrenheit to kelvin.
	 * @param fah the temperature in fahrenheit.
	 * @return the temperature in kelvin.
	 * 
	 * @author xbony2
	 */
	public static double fanrenheitToKelvin(double fah){
		fah =+ 459.67;
		fah = fah * (5/9);
		return fah;
	}
	
	/**
	 * Converts celsius to fahrenheit.
	 * @param cel the temperature in celsius.
	 * @return the temperature in fahrenheit,
	 * 
	 * @author xbony2
	 */
	public static double celsiusToFahrenheit(double cel){
		cel = cel * (9/5);
		cel =+ 32;
		return cel;
	}
	
	/**
	 * Converts celsius to kelvin.
	 * @param cel the temperature in celsius.
	 * @return the temperature in kelvin.
	 * 
	 * @author xbony2
	 */
	public static double celsiusToKelvin(double cel){
		cel += 273.15;
		return cel;
	}
	
	/**
	 * Converts kelvin to fahrenheit.
	 * @param kelv the temperature in kelvin.
	 * @return the temperature in fahrenheit.
	 * 
	 * @author xbony2
	 */
	public static double KelvinToFahrenheit(double kelv){
		kelv = kelv * (9/5);
		kelv =- 459.67;
		return kelv;
	}
	
	/**
	 * Converts kelvin to celsius.
	 * @param kelv the temperature in kelvin
	 * @return the temperature in celsius
	 * 
	 * @author xbony2
	 */
	public static double KelvinToCelsius(double kelv){
		kelv =- 273.15;
		return kelv;
	}
}
