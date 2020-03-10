package ru.job4j.collection.set;

import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task task : list) {
            if (numbers.isEmpty() && list.indexOf(task) == list.lastIndexOf(task)) {
                numbers.remove(list.lastIndexOf(task));
            }
        }
        return numbers;
    }
}
