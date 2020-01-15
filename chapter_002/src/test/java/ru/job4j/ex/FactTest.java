package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Bruki Mammad (bruki_mammd@mail.ru)
 * @version $Id$
 * @since 15.01.2020
 */

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNCouldNotBeLessThenOne() {
        int rsl = Fact.calc(0);
        assertThat(rsl, is(0));
    }
}
