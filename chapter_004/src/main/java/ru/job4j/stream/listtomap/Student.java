package ru.job4j.stream.listtomap;

import java.util.Objects;

/**
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version 1.0
 * @since 05.06.2020
 */
public class Student {

    private String surname;
    private int score;

    public Student(String surname, int score) {
        this.surname = surname;
        this.score = score;
    }

    public String getSurname() {
        return surname;
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
        return score == student.score && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, score);
    }
}
