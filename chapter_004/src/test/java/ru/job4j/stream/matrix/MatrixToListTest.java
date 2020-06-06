package ru.job4j.stream.matrix;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version 1.0
 * @since 06.06.2020
 */
public class MatrixToListTest {

    @Test
    public void whenMatrixToList() {
        Integer[][] matrix = new Integer[][]{
                {1, 2},
                {3, 4}
        };
        List<Integer> expected = List.of(1, 2, 3, 4);
        MatrixToList list = new MatrixToList();
        List<Integer> result = list.convert(matrix);
        assertThat(expected, is(result));
    }
}
