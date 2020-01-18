package ru.job4j.ex;

/**
 * @author Bruki Mammad (bruki_mammd@mail.ru)
 * @version $Id$
 * @since 19.01.2020
 */

public class FactRec {
    public static int calc(int n) {
        if (n == 1) {
            int rsl = 1;
            return rsl;
        }
        return calc(n - 1) * n;
    }

    public static void main(String[] args) {
        int rsl = calc(3);
        System.out.println(rsl);
    }
}
