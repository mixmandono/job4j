package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Pavel Kolos (mailto:pavelkolos777@gmail.com)
* @version $Id$
* @since 0.1
*/
public class CalculateTest {
/**
* Test echo.
*/ @Test
public void whenTakeNameThenTreeEchoPlusName() {
    String input = "Pavel Kolos";
    String expect = "Echo, echo, echo : Pavel Kolos"; 
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
}
 
}