package ru.job4j.stream.studentlevel;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Необходимо реализовать метод levelOf.
 *
 * Метод должен вернуть список студентов, у которых балл аттестата больше bound.
 *
 * Во входящем списке могут быть null элементы.
 * Порядок действий.
 * - Используя метод flatMap убрать null;
 * - Отсортировать список;
 * - Используя метод takeWhile, получить нужный поток;
 * - Сохранить поток в List.
 *
 * @author Bruki mammad (bruki_mammad@mail.ru)
 * @version $1.0$
 * @since 13.06.2020
 */
public class StudentLevel {
    /**
     * method levelOf - фильтрует список студентов, у которых балл аттестата больше bound.
     * @param students - список студентов.
     * @param bound - проходной балл.
     * @return список студентов, у которых балл аттестата больше bound.
     */
    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .flatMap(Stream::ofNullable)
                .sorted(Comparator.comparingInt(Student::getScope))
                .takeWhile(student -> student.getScope() > bound)
                .collect(Collectors.toList());
    }
}
