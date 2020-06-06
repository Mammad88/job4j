package ru.job4j.stream.listtomap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Преобразования списка в карту.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version 2.0
 * @since 06.06.2020
 */
public class ListToMap {
    /**
     * метод пеобразует список в map, с ключом surname.
     *
     * @param list - список студентов.
     * @return map, поле score - знание студента в баллах.
     */
    Map<String, Student> convert(List<Student> list) {
        try {
            return list.stream()
                    .distinct()
                    .collect(Collectors.toMap(Student::getSurname, student -> student));
        } catch (IllegalStateException ise) {
            throw new IllegalStateException();
        }
    }
}
