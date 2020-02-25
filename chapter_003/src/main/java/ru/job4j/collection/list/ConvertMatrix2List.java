package ru.job4j.collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * class ConvertMatrix2List - конвертация двухмерного массива в ArrayList.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version 1.0
 * @since 25.02.2020
 */
public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            for (int cell : row) {
                list.add(cell);
            }
        }
        return list;
    }

    /**
     * Вывод конвертируемого двухмерного массива в  Arrraylist.
     *
     * @param args - args.     *
     */
    public static void main(String[] args) {
        ConvertMatrix2List convertMatrix2List = new ConvertMatrix2List();
        System.out.println("Массив: " + convertMatrix2List.toList(new int[][]{{1, 2}, {3, 4}}));
    }
}
