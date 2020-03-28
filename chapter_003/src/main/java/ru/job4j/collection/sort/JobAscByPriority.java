package ru.job4j.collection.sort;

import java.util.Comparator;
/**
 * class JobAscByPriority - сортировка компаратора по приоритету и по возрастанию.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $1.0$
 * @since 24.03.2020
 */
public class JobAscByPriority implements Comparator<Job> {
    @Override
    public int compare(Job first, Job second) {
        return Integer.compare(first.getPriority(), second.getPriority());
    }
}
