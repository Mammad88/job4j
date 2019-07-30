package ru.job4j.array;

/**
 * Алгоритм сортировки методом престановки (пузырьком).
 * @author Bruki Mammad (bruki_mmamd@mail.ru)
 * @version $Id$
 * @since 29.07.2019
 */
public class BubbleSort {
    /**
     * Class BubbleSort.
     * @param array - не сортируемый массив
     * @return array - сортируемый массив.
     */
    public int[] sort(int[] array) {
         for (int i = 0; i < array.length; i++) {
             for (int j = 0; j < array.length - i - 1; j++) {
                 if (array[j] > array[j + 1]) {
                     int temp = array[j];
                     array[j] = array[j + 1];
                     array[j + 1] = temp;
                 }
             }
         }
        return array;
    }
}

