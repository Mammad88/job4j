package ru.job4j.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version 2.0
 * @since 05.06.2020
 */
public class School {
    /**
     * Метод фильтрует список учеников по предикату.
     *
     * @param students список учеников.
     * @param predict  предикат.
     * @return отфильтрованынй список.
     */
    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).collect(Collectors.toList());
    }
}
