package ru.job4j.condition;

public class SqArea {
    /**
     * SqArea.
     * @author Bruki Mammad (bruki_mammad@mail.ru)
     * @version $id$
     * @since 03.07.2019
     */
    public int square(int p, int k) {
        int h = p / (2 * (k + 1));
        int w = h * k;
        int s = w * h;
        return s;
    }
}

