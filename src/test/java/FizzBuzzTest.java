import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	
	FizzBuzz fizzBuzz;
	
	@Before
	public void setUp() {
		fizzBuzz = new FizzBuzz();
	}
	
	@Test
	public void whenNumberIsOneOutputShouldBeOne() {
		assertEquals("1", fizzBuzz.fizz(1));
	}
	@Test
	public void whenNumberisTwoOutputShouldBeTwo() {
		assertEquals("2", fizzBuzz.fizz(2));
	}
	@Test
	public void whenNumberIsDivisibleByThreeOutputShouldBeFizz() {
		assertEquals("Fizz", fizzBuzz.fizz(3));
		assertEquals("Fizz", fizzBuzz.fizz(6));
	}
	@Test
	public void whenNumberisDivisibleBtFiveOutputShouldBeBuzz() {
		assertEquals("Buzz", fizzBuzz.fizz(5));
		assertEquals("Buzz", fizzBuzz.fizz(10));
	}
	@Test
	public void whenNumberIsDivisibleByThreeAndFiveOutputShouldBeFizz() {
		assertEquals("FizzBuzz", fizzBuzz.fizz(15));
	}
}

