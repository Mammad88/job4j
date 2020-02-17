package ru.job4j.coffeemachine;

import java.util.Arrays;

/**
 * class Machine - кофемашина.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version 0.1
 * @since 16.02.20
 */

public class Machine {

    /**
     * Монеты в автомате.
     */
    private final int[] coins = {10, 5, 2, 1};

    /**
     * Метод выдачи сдачи для автомата.
     *
     * @param money - общая сумма денег.
     * @param price - цена кофе в кофемашине.
     * @return rsl - возвращаем сдачу в кофемашине.
     */
    public int[] changes(int money, int price) throws NeedMoreMoneyException {
        if (money - price < 0) {
            throw new NeedMoreMoneyException();
        }
        int changes = (money > price ? money - price : 0);
        int[] rsl = new int[100];
        int size = 0;
        for (int index = 0; index < coins.length; index++) {
            while (changes >= coins[index]) {
                changes -= coins[index];
                rsl[size++] = coins[index];
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
