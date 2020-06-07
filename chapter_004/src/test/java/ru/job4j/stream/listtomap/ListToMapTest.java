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
        ListToMap select = new ListToMap();
        Map<String, Student> result = select.convert(listOne);
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

    @Test
    public void whenUniqueListToMapGradeTenA() {
        Student ivanovOne = new Student("Ivanov", 20);
        Student sidorov = new Student("Sidorov", 20);
        Student petrovOne = new Student("Petrov", 30);
        Student alekseevOne = new Student("Alekseev", 40);
        Student yanovskyOne = new Student("Yanovsky", 50);
        Student ivanTwo = new Student("Ivanov", 10);
        Student drozdov = new Student("Drozdov", 70);
        Student chaban = new Student("Chaban", 80);
        Student petrovTwo = new Student("Petrov", 30);
        Student yakovenko = new Student("Yakovenko", 100);
        Student yanovskyTwo = new Student("Yanovsky", 50);
        Student alekseevTwo = new Student("Alekseev", 40);

        List<Student> listTwo = List.of(
                ivanovOne,
                sidorov,
                petrovOne,
                alekseevOne,
                yanovskyOne,
                ivanTwo,
                drozdov,
                chaban,
                petrovTwo,
                yakovenko,
                yanovskyTwo,
                alekseevTwo
        );

        ListToMap select = new ListToMap();
        Map<String, Student> result = select.convert(listTwo);
        Map<String, Student> expected = Map.of(
                alekseevOne.getSurname(), alekseevOne,
                chaban.getSurname(), chaban,
                drozdov.getSurname(), drozdov,
                ivanovOne.getSurname(), ivanovOne,
                petrovOne.getSurname(), petrovOne,
                sidorov.getSurname(), sidorov,
                yanovskyOne.getSurname(), yanovskyOne,
                yakovenko.getSurname(), yakovenko
        );
        assertThat(expected, is(result));
    }
}
