package ru.job4j.collection.set;

import java.util.HashSet;
import java.util.List;

/**
 * Уникальные задачи.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version 3.0
 * @since 10.03.2020
 */
public class FullSearch {

    /**
     * Method extractNumber -  убирает дубликаты из списка, полученного от системы.
     *
     * @param list - коллекцию задач с номерами и описанием.
     * @return уникальные номера задач.
     */
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task task : list) {
            numbers.add(task.getNumber());
        }
        return numbers;
    }
}
