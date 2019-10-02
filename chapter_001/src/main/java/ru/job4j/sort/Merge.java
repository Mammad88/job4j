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
        int[] rsl = new int[left.length + right.length]; // Создание итогового массива.
        int i = 0, j = 0, k = 0; // Индексы итерации по массивам.
        while (i < left.length && j < right.length) {
            rsl[k++] = left[i] < right[j] ? left[i++] : right[j++];
        }
        while (i < left.length) { //пока первый элемент левого массива меньше всего масива.
            rsl[k++] = left[i++]; // первый элемент левого массива добавляем в итоговый массив.
        }
        while (j < right.length) { //пока первый элемент правого массива меньше всего масива.
            rsl[k++] = right[j++]; //первый элемент правого массива добавляем в итоговый массив.
        }
        return rsl; //возврашаем итоговый массив.
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

