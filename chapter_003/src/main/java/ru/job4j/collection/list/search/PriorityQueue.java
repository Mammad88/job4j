package ru.job4j.collection.list.search;

import java.util.LinkedList;

/**
 * class  PriorityQueue - очередь с приоритетом.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version 0.1
 * @since 23.02.20
 */
public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставки использовать add(int index, E value)
     *
     * @param task задача
     */
    public void put(Task task) {
        var index = 0;
        for (var element : tasks) {
            if (element != null && element.getPriority() > task.getPriority()) {
                break;
            }
            index++;
        }
        tasks.add(index, task);
    }

    public Task take() {
        return tasks.remove(0);
    }
}
