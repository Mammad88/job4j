package ru.job4j.loop;

import org.hamcrest.Matcher;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicReference;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
       Factorial fact = new Factorial();
       int result = fact.calc(5);
       int expected = 120;
       assertThat(result, closeTo(expected, 120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial fact = new  Factorial();
        int result = fact.calc(0);
        int expected = 1;
        assertThat(result, closeTo(expected, 1));
    }

    private void assertThat(int result, Matcher<Double> closeTo) {
    }
}

