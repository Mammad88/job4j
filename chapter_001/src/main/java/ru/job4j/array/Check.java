package ru.job4j.array;

/**
 * @author Bruki mammad (bruki_mammad@mail.ru)
 * @version $Id$
 * @since 28.07.2019
  */
public class Check {
    /**
     * class Check - проверяет какой-нибудь один элемент со всеми элементами и выдает результат.
     * @param data array.
     * @return result.
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            if (data[0] != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
