package ru.job4j.collection.sort;

import java.util.Comparator;

/**
 * class JobAscByName - сортировка компаратора по имени и по возрастанию.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $1.0$
 * @since 24.03.2020
 */
public class JobAscByName implements Comparator<Job> {
    @Override
    public int compare(Job first, Job second) {
        return first.getName().compareTo(second.getName());
    }
}
