package Chapter2;

import java.util.Scanner;

public class Temperature {
	private String scale;
	private double degrees;
	/** constructor with specified degrees and scale */
	public Temperature(double tempDegrees, String tempScale) {
		scale = tempScale;
		degrees = tempDegrees;
	}

	/**
	 * Mutator. Converts this Temperature to degrees Fahrenheit. Precondition:
	 * Temperatureisavalidtemperature in degrees Celsius.
	 * 
	 * @return this temperature in degrees Fahrenheit
	 */
	public double toFahrenheit() {
		degrees = degrees * 1.8 + 32;
		scale = "F";
		return this.degrees;
	}

	/**
	 * Mutator. Converts this Temperature to degrees Celsius. Precondition:
	 * Temperatureisavalidtemperature in degrees Fahrenheit.
	 * 
	 * @return this temperature in degrees
	 */
	public double toCelsius() {
		degrees = (degrees - 32) / 1.8;
		scale = "C";
		return this.degrees;
	}

	/**
	 * Mutator.
	 * 
	 * @param amt the number of degrees to
	 * @return this temperature raised by amt degrees
	 */
	public Temperature raise(double amt) {
degrees+=amt;
return this;
	}

	/**
	 * Mutator.
	 * 
	 * @param amt the number of degrees
	 * @return this temperature lowered
	 */
	public Temperature lower(double amt) {
		degrees-=amt;
		return this;
	}

	/**
	 * @param tempDegrees the number of
	 * @param tempScale   the temperature
	 * @return true if tempDegrees is a in the given temperature scale, false
	 *         otherwise
	 */
	public static boolean isValidTemp(double tempDegrees, String tempScale) {
		return true;
		}
	// Other methods are not shown.
}