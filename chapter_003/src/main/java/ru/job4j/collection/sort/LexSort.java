package ru.job4j.collection.sort;

import java.util.Comparator;

/**
 * class LexSort - сортировка номера .
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $1.0$
 * @since 28.03.2020
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
        if (left.length() > right.length()) {
            return 1;
        } else if (left.length() < right.length()) {
            return -1;
        }
        return left.compareTo(right);
    }
}
