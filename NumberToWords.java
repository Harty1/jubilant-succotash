package edu.example.converter;

import edu.example.exceptions.ServiceException;

/**
 * Converts numerals to meaningful words.
 * @author Harsh
 *
 */
public interface NumberToWords {
	static final String[] unitsAndTeens = {"", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine", " ten", 
		" eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen", " eighteen", " nineteen"};
	static final String[] tens = {"", " ten", " twenty", " thirty", " forty", " fifty", " sixty", " seventy", " eighty", " ninety"};
	static final String[] specialNames = {"", " thousand", " million", " billion", " trillion", " quadrillion", " quintillion"};
	
	/**
	 * This method transforms a numeral into meaningful words.
	 * @param number - Number that needs to be transformed into words.
	 * @return - Equivalent words for input parameter.
	 * @throws ServiceException
	 */
	public String transform(Integer number) throws ServiceException;
}
