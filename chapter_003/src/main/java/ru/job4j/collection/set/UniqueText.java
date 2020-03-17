package ru.job4j.collection.set;

import java.util.Arrays;
import java.util.HashSet;

/**
 * class UniqueText - идентичные тексты.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version 2.0
 * @since 17.03.2020
 */
public class UniqueText {
    /**
     * method isEquals - сравнивает два текста на уникальность.
     *
     * @param originText    - исходный текст.
     * @param duplicateText - проверяемый текст.
     * @return rsl - возврашает результат на уникальность.
     */
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = false;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String original : origin) {
            check.add(original);
            rsl = (Arrays.equals(origin, text)) || check.contains(duplicateText);
            System.out.println(rsl);
        }
        return rsl;
    }
}
