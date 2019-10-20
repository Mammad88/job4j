package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void whenZeroAndTwoThenTwo() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double result = a.distance(b);
        System.out.println(result);
        assertThat(result, is(2D));
    }

    @Test
    public void whenZeroAndZeroAndThreeThenThree() {
        Point point1 = new Point(0, 0,0);
        Point point2 = new Point(0, 0,3);
        double result = point1.distance3d(point2);
        double expected = 3D;
        System.out.println(String.format("Result is %s", result));
        assertThat(result, closeTo(expected, 0.1));
    }
}
