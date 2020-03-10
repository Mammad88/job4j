package ru.job4j.collection.set;

import java.util.HashSet;

/**
 * class UsageHashSet использование HashSet.
 *
 * @author Bruki Mammad (bruki_mammd@mail.ru)
 * @version $1.0$
 * @since 02.03.2020
 */
public class UsageHashSet {
    public static void main(String[] args) {
        /**
         * вставка элементов в колекцию HashSet через метод add.
         */
        HashSet<String> autos = new HashSet<String>();
        autos.add("Lada");
        autos.add("BMW");
        autos.add("Volvo");
        autos.add("Toyota");
        // чтение даннаых из массива.
        for (String auto : autos) {
            System.out.println(auto);
        }
    }
}
