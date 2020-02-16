package ru.job4j.coffee;

import java.util.Arrays;

/**
 * class Machine - кофемашина.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version 0.1
 * @since 16.02.20
 */

public class Machine {

    private final int[] COINS = {10, 5, 2, 1};

    /**
     * @param money - общая сумма денег.
     * @param price - цена кофе в кофемашине.
     * @return rsl - возвращаем сдачу в кофемашине.
     */

    public int[] change(int money, int price) {
        int changes = (money > price ? money - price : 0);
        int[] rsl = new int[100];
        int size = 0;
        for (int index = 0; index < COINS.length; index++) {
            while (changes >= COINS[index]) {
                changes -= COINS[index];
                rsl[size++] = COINS[index];
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
