import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
	@Test
	public void whenNumberIsOneOutputShouldBeOne() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("1", fizzBuzz.fizz(1));
	}
}
