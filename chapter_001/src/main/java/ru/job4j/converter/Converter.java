package ru.job4j.converter;

/**
 * Корвертор валюты.
 */

public class Converter {

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */

    public int rubleToEuro(int value) {
        int euro = 70;
        return value / euro;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары.
     */
    public int rubleToDollar(int value) {
        int dollar = 60;
        return value / dollar;
    }

    /**
     * Конвертируем euro в рубли.
     * @param value euro.
     * @return Рубли.
     */

    public int euroToRuble(int value) {
        int euro = 70;
        int i = euro * value;
        return i;

    }
    /**
     * Конвертируем доллары в рубли.
     * @param value доллары.
     * @return Рубли.
     */

    public int dollarToRuble(int value) {
        int dollar = 60;
        return value * dollar;
    }
}