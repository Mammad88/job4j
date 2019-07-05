package ru.job4j.condition;

/**
 * Max.
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $id$
 * @since 05.07.2019
 */
public class Max {
    public int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

}

