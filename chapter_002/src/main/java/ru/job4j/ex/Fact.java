package ru.job4j.ex;

/**
 * @author Bruki Mammad (bruki_mammd@mail.ru)
 * @version $Id$
 * @since 15.01.2020
 */
public class Fact {
    public static void main(String[] args) {
        System.out.println(calc(0));
    }

    public static int calc(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n could not be less then 1 ");
        }

        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
