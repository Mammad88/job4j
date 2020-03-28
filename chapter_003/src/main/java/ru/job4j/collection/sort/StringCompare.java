package ru.job4j.collection.sort;

import java.util.Comparator;

/**
 * class StringCompare - компаратор для сравнения двух массивов символов.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $1.0$
 * @since 28.03.2020
 */
public class StringCompare implements Comparator<String> {
    /**
     * Method compare - сравнивает в лексикографическом порядке элементы двух списков,
     * находящихся на одних и тех же позициях (под одним и тем же индексом) и возврашает результат сравнения.
     *
     * @param left  - первая строка.
     * @param right - вторая строка.
     * @return результат спавнения.
     */
    @Override
    public int compare(String left, String right) {
        int result = 0;
        int delta = Math.min(left.length(), right.length());
        for (int index = 0; index < delta; index++) {
            result = Character.compare(left.charAt(index), right.charAt(index));
            if (result != 0) {
                break;
            }
        }
        return result == 0 ? left.length() - right.length() : result;
    }
}
