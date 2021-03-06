package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas1Then3() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3, 1};
        int value = 1;
        int result = find.indexOf(input, value);
        int expect = 3;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas9Then4() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3, 1, 9};
        int value = 9;
        int result = find.indexOf(input, value);
        int expect = 4;
        assertThat(result, is(expect));
    }

}

