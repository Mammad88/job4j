package ru.job4j.loop;


import org.hamcrest.Matcher;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;


public class CounterTest {
    @SuppressWarnings(value = "unused ")
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter counter = new Counter();
        int result = counter.add(1, 30);
        int expected = 30;
        assertThat(result, closeTo(expected, 30));
    }

    private void assertThat(int result, Matcher<Double> closeTo) {
    }
}

