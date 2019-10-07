package ru.job4j.condition;

/**
 * Max.
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $id$
 * @since 05.07.2019
 */
public class Max {
    /**
     * class - Max.
     * @param left - левый.
     * @param right - правый.
     * @return result.
     */
    public int max(int left, int right) {
        /**
         * method max.
         * сравнивает: если left  > правого, то возврашает left, иначе right.
         */
        int result = left > right ? left : right;
        return result;
    }
}

