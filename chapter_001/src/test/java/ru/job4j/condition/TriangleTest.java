package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * class TriangleTest.
 */

public class TriangleTest {
    /**
     * Test программы по вычислению площади треугольника.
     */
      @Test
      public void whenAreaSetThreePointsThenTriangleArea() {
          // Создаем три объекта класса Point.
          Point first = new Point(0, 0);
          Point second = new Point(0, 2);
          Point third = new Point(2, 0);
          // Создаем объект треугольник и передаем в него объекты точек.
          Triangle triangle = new Triangle(first, second, third);
          // Вычисляем площадь треугольника.
          double result = triangle.area();
          // Задаем ожидаемый результат.
          double expected = 2D;
          // Проверяем результат и ожидаемое значение.
          System.out.println(String.format("Result is %s", result));
          assertThat(result, closeTo(expected, 0.1));
      }
}
