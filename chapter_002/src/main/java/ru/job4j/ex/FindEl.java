package ru.job4j.ex;

/**
 * @author Bruki Mammad (bruki_mammd@mail.ru)
 * @version $Id$
 * @since 15.01.2020
 */

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        if (key == null) {
            throw new ElementNotFoundException("Element not found exception.");
        }

        int rsl = -1;
        // цикл for
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            indexOf(new String[]{"Element"}, "Element");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
