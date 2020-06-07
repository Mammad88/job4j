package ru.job4j.stream.listtomap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Преобразования списка в карту.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version 3.0
 * @since 07.06.2020
 */
public class ListToMap {
    /**
     * метод Colectors.toMap - с тремя параметрами, где третьим параметром мы передаем лямду,
     * возвращающую того студента из двух , которого нужно оставить по Score(по баллам) при дубликатах.
     *
     * @param list - список студентов.
     * @return map, поле score - знание студента в баллах.
     */
    Map<String, Student> convert(List<Student> list) {
        return list.stream()
                .collect(Collectors.toMap(Student::getSurname, student -> student,
                        ((student, student2) -> student.getScore() > student2.getScore() ? student : student2)));
    }
}
