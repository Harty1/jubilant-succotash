package edu.example.converter;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.Test;

/**
 * Test suite for testing NumberToWords service
 */
import edu.example.converter.impl.NumberToWordsImpl;

public class TestNumberToWords extends TestCase {

	private NumberToWords service;
	
	public TestNumberToWords() {
		service = new NumberToWordsImpl();
	}
	
	/**
	 * Tests the service method transform(Integer number)
	 * @throws Exception
	 */
	@Test
	public void testTransform() throws Exception {
		String word = service.transform(100);
		Assert.assertEquals("one hundred", word);
		
		word = service.transform(1000);
		Assert.assertEquals("one thousand", word);
		
		word = service.transform(999987);
		Assert.assertEquals("nine hundred ninety nine thousand nine hundred eighty seven", word);
	}
}
