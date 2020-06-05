package ru.job4j.stream.listtomap;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ListToMapTest {

    @Test
    public void whenGradeTenA() {
        Student ivanov = new Student("Ivanov", 10);
        Student sidorov = new Student("Sidorov", 20);
        Student petrov = new Student("Petrov", 30);
        Student alekseev = new Student("Alekseev", 40);
        Student yanovsky = new Student("Yanovsky", 50);
        Student chumakov = new Student("Chumakov", 60);
        Student drozdov = new Student("Drozdov", 70);
        Student chaban = new Student("Chaban", 80);
        Student sinicina = new Student("Sinicina", 90);
        Student yakovenko = new Student("Yakovenko", 100);

        List<Student> listOne = List.of(
                ivanov,
                sidorov,
                petrov,
                alekseev,
                yanovsky,
                chumakov,
                drozdov,
                chaban,
                sinicina,
                yakovenko
        );
        ListToMap sel = new ListToMap();
        Map<String, Student> result = sel.convert(listOne);
        Map<String, Student> expected = Map.of(
                ivanov.getSurname(), ivanov,
                sidorov.getSurname(), sidorov,
                petrov.getSurname(), petrov,
                alekseev.getSurname(), alekseev,
                yanovsky.getSurname(), yanovsky,
                chumakov.getSurname(), chumakov,
                drozdov.getSurname(), drozdov,
                chaban.getSurname(), chaban,
                sinicina.getSurname(), sinicina,
                yakovenko.getSurname(), yakovenko
        );
        assertThat(expected, is(result));
    }
}
