package ru.job4j.stream.studentlevel;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StudentLevelTest {

    @Test
    public void whenSorted() {
        List<Student> input = new ArrayList<>();
        input.add(new Student("Max", 128));
        input.add(new Student("Masha", 28));
        List<Student> expected = List.of(
                new Student("Masha", 28),
                new Student("Max", 128)
        );
        assertThat(StudentLevel.levelOf(input, 20), is(expected));
    }

    @Test
    public void whenOnlyNull() {
        List<Student> input = new ArrayList<>();
        input.add(null);
        List<Student> expected = List.of();
        assertThat(StudentLevel.levelOf(input, 100), is(expected));
    }

    @Test
    public void whenHasNull() {
        List<Student> input = new ArrayList<>();
        input.add(null);
        input.add(new Student("Max", 28));
        List<Student> expected = List.of(new Student("Max", 28));
        assertThat(StudentLevel.levelOf(input, 10), is(expected));
    }
}
