package ru.job4j.array;

/**
 * @author Bruki Mammad.
 * @version $id$
 * @since 27.07.2019
 */
public class Square {
    /**
     * class - Square.
     * создание массива через цикл элементами от 1 до bound возведенными в квадрат.
     * @param bound size array.
     * @return squaring array.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {

            rst[i] = (int) Math.pow((i + 1), 2);

        }
        return rst;
    }

}


