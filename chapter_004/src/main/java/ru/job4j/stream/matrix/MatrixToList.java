package ru.job4j.stream.matrix;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Преобразование двумерного массива в список чисел.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version 1.0
 * @since 06.06.2020
 */
public class MatrixToList {

    /**
     * Метод конвертирует двухмерный массив Integer в список Integer.
     *
     * @param matrix Integer[][] - двухмерный массив.
     * @return List<Integer> список целых чисел.
     */
    public List<Integer> convert(Integer[][] matrix) {
        return Stream.of(matrix).flatMap(Stream::of).collect(Collectors.toList());
    }
}
