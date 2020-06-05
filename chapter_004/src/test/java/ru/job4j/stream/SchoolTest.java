package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version 1.0
 * @since 05.06.2020
 */
public class SchoolTest {
    /**
     * Список ученико 10 класса.
     */
    @Test
    public void ClassTenA() {
        School select = new School();
        List<Student> students = Arrays.asList(
                new Student("Ivanov", 10),
                new Student("Sidorov", 20),
                new Student("Petrov", 30),
                new Student("Alekseev", 40),
                new Student("Yanovsky", 50),
                new Student("Chumakov", 60),
                new Student("Drozdov", 70),
                new Student("Chaban", 80),
                new Student("Sinicina", 90),
                new Student("Yakovenko", 100)
        );

        /**
         * метод collect фильтрует учеников 10-го класса с баллами от 70 до 100.
         */
        List<Student> result = select.collect(students, student -> student.getScore() >= 70 && student.getScore() <= 100);
        List<Student> expected = Arrays.asList(
                new Student("Drozdov", 70),
                new Student("Chaban", 80),
                new Student("Sinicina", 90),
                new Student("Yakovenko", 100)
        );
        assertThat(expected, is(result));
    }

    @Test
    public void ClassTenB() {
        School select = new School();
        List<Student> students = Arrays.asList(
                new Student("Ivanov", 10),
                new Student("Sidorov", 20),
                new Student("Petrov", 30),
                new Student("Alekseev", 40),
                new Student("Yanovsky", 50),
                new Student("Chumakov", 60),
                new Student("Drozdov", 70),
                new Student("Chaban", 80),
                new Student("Sinicina", 90),
                new Student("Yakovenko", 100)
        );

        /**
         * метод collect фильтрует учеников 10-го класса с баллами от 50 до 69.
         */
        List<Student> result = select.collect(students, student -> student.getScore() >= 50 && student.getScore() < 70);
        List<Student> expected = Arrays.asList(
                new Student("Yanovsky", 50),
                new Student("Chumakov", 60)
        );
        assertThat(expected, is(result));
    }

    @Test
    public void ClassTenC() {
        School select = new School();
        List<Student> students = Arrays.asList(
                new Student("Ivanov", 10),
                new Student("Sidorov", 20),
                new Student("Petrov", 30),
                new Student("Alekseev", 40),
                new Student("Yanovsky", 50),
                new Student("Chumakov", 60),
                new Student("Drozdov", 70),
                new Student("Chaban", 80),
                new Student("Sinicina", 90),
                new Student("Yakovenko", 100)
        );

        /**
         * метод collect фильтрует учеников 10-го класса с баллами от 0 до 49.
         */
        List<Student> result = select.collect(students, student -> student.getScore() >= 0 && student.getScore() < 50);
        List<Student> expected = Arrays.asList(
                new Student("Ivanov", 10),
                new Student("Sidorov", 20),
                new Student("Petrov", 30),
                new Student("Alekseev", 40)
        );
        assertThat(expected, is(result));
    }
}
