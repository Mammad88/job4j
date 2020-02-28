package ru.job4j.collection.list;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Конвертация листа массивов в один лист Integer.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version 1.0
 * @since 28.02.2020
 */
public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] row : list) {
            for (int cell : row) {
                rsl.add(cell);
            }
        }
        return rsl;
    }

    /**
     * Вывод результата на консоль.
     *
     * @param args - args.
     */
    public static void main(String[] args) {
        List<Integer> result = convert(asList(new int[]{1, 2}, new int[]{3, 4, 5, 6}));
        System.out.println(result);
    }
}
