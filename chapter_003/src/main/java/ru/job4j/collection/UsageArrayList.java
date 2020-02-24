package ru.job4j.collection;

import java.util.ArrayList;

/**
 * class UsageArrayList - использование коллекции.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version 0.1
 * @since 20.02.20
 */
public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Petr");
        names.add("Ivan");
        names.add("Stepan");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
