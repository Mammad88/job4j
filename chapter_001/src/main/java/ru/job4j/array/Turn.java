package ru.job4j.array;

/**
 * @author Bruki Mammad (bruki_mmammad@mail.ru).
 * @version $Id$
 * @since 27.07.2019
 */
public class Turn {
    /**
     * class - Turn.
     * Turn array in a reverse order.
     * @param array array.
     * @return turn array.
     */

    public int[] back(int[] array) {
        for (int i = 0;  i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}


