package ru.job4j.array;
/**
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $ID$
 * @since 28.07.2019
 */
public class Matrix {
    /**
     * class - Matrix.
     * строим таблицу умножения.
     * @param size указывает на размер таблицы.
     * @return matrix.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int out = 0; out < table.length; out++) {
            for (int inner = 0; inner < table.length; inner++) {
                    table[out][inner] = (out + 1) * (inner + 1);
            }
        }
        return table;
    }
}

