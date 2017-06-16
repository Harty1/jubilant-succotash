package edu.example.converter.impl;

import edu.example.converter.NumberToWords;
import edu.example.exceptions.ServiceException;

/**
 * Service for transforming numerals to words.
 * @author Harsh
 *
 */
public class NumberToWordsImpl implements NumberToWords {


	/**
	 * This method transforms a numeral into meaningful words.
	 */
	@Override
	public String transform(Integer number) throws ServiceException {
		if (number == 0) 
			return "zero";

		String prefix = "";

		if (number < 0) {
			number = -number;
			prefix = "negative";
		}

		String current = "";
		int place = 0;

		do {
			int n = number % 1000;
			if (n != 0){
				String s = transformLessThanAThousand(n);
				current = s + specialNames[place] + current;
			}
			place++;
			number /= 1000;
		} while (number > 0);

		return (prefix + current).trim();
	}

	private String transformLessThanAThousand(Integer number) {
		String currentNum;

		if (number % 100 < 20){
			currentNum = unitsAndTeens[number % 100];
			number /= 100;
		}
		else {
			currentNum = unitsAndTeens[number % 10];
			number /= 10;

			currentNum = tens[number % 10] + currentNum;
			number /= 10;
		}
		if (number == 0) return currentNum;
		return unitsAndTeens[number] + " hundred" + currentNum;
	}
}
