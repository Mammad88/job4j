package ru.job4j.stragery;

import org.junit.Test;

import java.util.StringJoiner;

import static java.lang.System.lineSeparator;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Bruki Mammad (bruki_mammd@mail.ru)
 * @version $2.0$
 * @since 02.01.2020
 */

public class TriangleTest {
    @Test
    public void whenDrawTriangle() {
        Triangle triangle = new Triangle();
        assertThat(
                triangle.draw(),
                is(
                        new StringJoiner(
                                System.lineSeparator())
                                .add("   +   ")
                                .add("  + +  ")
                                .add(" +   + ")
                                .add("+ + + +")
                                .toString()
                )
        );
    }
}
