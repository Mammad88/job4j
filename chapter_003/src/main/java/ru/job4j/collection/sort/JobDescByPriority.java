package ru.job4j.collection.sort;

import java.util.Comparator;
/**
 * class JobDescByPriority - сортировка компаратора по приоритету и по убыванию.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $1.0$
 * @since 24.03.2020
 */
public class JobDescByPriority implements Comparator<Job> {
    @Override
    public int compare(Job first, Job second) {
        return Integer.compare(second.getPriority(), first.getPriority());
    }
}
