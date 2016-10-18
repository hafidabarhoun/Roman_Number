package hello;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class RomanNumberConverterTest {
	
	RomanNumberConverter converter;
	
	@Before
	public void setup() {
		converter = new RomanNumberConverter();
	}
	
	@Test
	public void check_roman_to_decimal() {
			
	}
	
	@Test
	public void check_decimal_to_roman() {
		
	}
	
	@After
	public void end() {
		converter = null;
	}
}
