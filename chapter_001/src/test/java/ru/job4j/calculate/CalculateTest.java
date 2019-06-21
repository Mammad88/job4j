package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version 2.0
 * @since 0.1
 */
public class CalculateTest {
/**
 * Test echo.
 */

@Test
 public void whenTakeNameThenThreeEchoPlusName() {
	 String input = "Bruki Mammad";
	 String expect = "Echo, echo, echo : Bruki Mammad";
	 Calculate calc = new Calculate();
	 String result = calc.echo(input);
	 assertThat(result, is(expect));
 }
	
}