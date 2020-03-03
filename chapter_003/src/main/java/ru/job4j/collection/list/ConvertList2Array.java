package ru.job4j.collection.list;

import java.util.LinkedList;
import java.util.List;

/**
 * Конвертируем лист в двумерный массив.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $3.0$
 * @since 03.03.2020
 */
public class ConvertList2Array {

    public static int[][] toArray(List<Integer> list, int rows) {
        int cells = list.size() % 3 != 0 ? (int) Math.ceil((double) (list.size() / rows)) + 1 : (int) Math.ceil((double) (list.size() / rows));
        int[][] array = new int[rows][cells];
        int row = 0, cell = 0;
        for (Integer num : list) {
            array[row][cell++] = num;
            if (cell == cells) {
                cell = 0;
                row++;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        int[][] rsl = toArray(list, 3);
        for (int[] row : rsl) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
