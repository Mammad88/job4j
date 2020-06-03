package ru.job4j.lamda;

import org.junit.Test;
import ru.job4j.lambda.FunctionInRange;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FunctionInRangeTest {
    @Test
    public void whenLinearFunctionFromFiveToEight() {
        FunctionInRange calculation = new FunctionInRange();
        List<Double> result = calculation.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenSquaredFunctionFromOneToFive() {
        FunctionInRange calculation = new FunctionInRange();
        List<Double> result = calculation.diapason(1, 5, x -> x * x);
        List<Double> expected = Arrays.asList(1D, 4D, 9D, 16D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLogFromOneToFour() {
        FunctionInRange calculation = new FunctionInRange();
        List<Double> result = calculation.diapason(1, 4, Math::log);
        List<Double> expected = Arrays.asList(0D, 0.6931471805599453D, 1.0986122886681098D);
        assertThat(result, is(expected));
    }
}
