package lifepoint.counter;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest extends Game{

	@Test
	public void testIntegerConversion() {
		assertEquals(91, integerConversion("91"));
		assertEquals(0, integerConversion(""));
		assertEquals(0, integerConversion("cow"));
		assertEquals(0, integerConversion("91 cows"));
	}
	@Test
	public void testMatches() {
		String text = new String("91");
		assertTrue("Number only failed", text.matches("\\d+"));
		text = "";
		assertFalse("Empty string failed", text.matches("\\d+"));
		text = "cows";
		assertFalse("Only characters failed", text.matches("\\d+"));
		text = "91 cows";
		assertFalse("Numbers white spaces and characters failed", text.matches("\\d+"));
	}

}
