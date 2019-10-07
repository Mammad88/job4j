package ru.job4j.sort;
import java.util.Arrays;

public class Merge {
    /**
     * Class - Merge - Сортировка слиянием
     * @author Bruki Mammad (bruki_mammad@mail.ru)
     * @version $id$
     * @since 02.10.2019
     * @param left - левый массив.
     * @param right - правый массив.
     * return итоговый массив.
     */
    public int[] merge(int[] left, int[] right) {
        // Создание итогового массива.
        int[] rsl = new int[left.length + right.length];
        // Индексы итерации по массивам.
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            rsl[k++] = left[i] < right[j] ? left[i++] : right[j++];
        }
        //пока первый элемент левого массива меньше всего масива.
        while (i < left.length) {
            // первый элемент левого массива добавляем в итоговый массив.
            rsl[k++] = left[i++];
        }
        //пока первый элемент правого массива меньше всего масива.
        while (j < right.length) {
            //первый элемент правого массива добавляем в итоговый массив.
            rsl[k++] = right[j++];
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}

