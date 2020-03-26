package ru.job4j.collection.sort;

import java.util.Comparator;
/**
 * class JobDescByName - сортировка компаратора по имени и по убыванию.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $1.0$
 * @since 24.03.2020
 */
public class JobDescByName implements Comparator<Job> {
    @Override
    public int compare(Job first, Job second) {
        return second.getName().compareTo(first.getName());
    }
}
