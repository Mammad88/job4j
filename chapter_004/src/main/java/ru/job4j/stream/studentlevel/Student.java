package ru.job4j.stream.studentlevel;

import java.util.Objects;

/**
 * @author Bruki mammad (bruki_mammad@mail.ru)
 * @version $1.0$
 * @since 13.06.2020
 */
public class Student {

    /**
     * ФИО студента.
     */
    private String surname;

    /**
     * Балл аттестата.
     */
    private int scope;

    public Student(String surname, int scope) {
        this.surname = surname;
        this.scope = scope;
    }

    public int getScope() {
        return scope;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return scope == student.scope && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, scope);
    }
}
