package ru.job4j.collection.sort;

import java.util.Comparator;

/**
 * class LexSort - сортировка номера.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $2.0$
 * @since 17.06.2020
 */
public class LexSort implements Comparator<String> {

    /**
     * Method compare - сравнивает начальный номер массива.
     *
     * @param left  - первая строка.
     * @param right - вторая строка.
     * @return результат сравнения.
     */
    @Override
    public int compare(String left, String right) {
        String leftN = left.split("\\.")[0];
        String rightN = right.split("\\.")[0];
        return Integer.compare(Integer.parseInt(leftN), Integer.parseInt(rightN));
    }
}
