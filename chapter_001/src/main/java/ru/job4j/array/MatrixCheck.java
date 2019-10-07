package ru.job4j.array;
/**
 * @author Bruki mammad (bruki_mammad@mail.ru)
 * @version $Id$
 * @since 01.08.2019
 */
public class MatrixCheck {
    /**
     * class - matrixCheck.
     * Check Matrix diagonal.
     * @param data matrix.
     * @return check.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        int size = data.length - 1;
        for (int i = 1; i <= size; i++) {
            if (data[0][0] != data[i][i]) {
                result = false;
                break;
            }
            if (data[0][size] != data[i][size - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
