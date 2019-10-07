package ru.job4j.array;
/**
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $ID$
 * @since 28.07.2019
 */

public class ArrayChar {
    /**
     * Class - ArrayChar.
     * Проверяет. что слово начинается с префикса.
     * @param prefix префикс.
     * @return если слово начинаеться с префикса.
     */

    public boolean startsWith(String word, String prefix) {
        /**
         * method startsWith.
         * Проверяет, что массив wrd  имеет первые элементы одинаковые с массивом pref.
         */
        boolean result = true;
        char[] pref = prefix.toCharArray();
        char[] wrd = word.toCharArray();
            if (pref.length > wrd.length) {
              result = false;
        } else {
            for (int i = 0; i < pref.length; i++) {
                if (pref[i] != wrd[i]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
