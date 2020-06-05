package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version 1.0
 * @since 05.06.2020
 */
public class ProfilesTest {

    @Test
    public void whenListProfileToListAddress() {
        Address london = new Address("London", "Baker", 10, 25);
        Address novoros = new Address("Novorossiysk", "Lenina", 169, 55);
        Address paris = new Address("Paris", "Marseilles", 13, 19);
        Address moscow = new Address("Moscow", "Red", 22, 58);

        Profile victor = new Profile(london);
        Profile stepan = new Profile(novoros);
        Profile aleksey = new Profile(paris);
        Profile lina = new Profile(moscow);

        List<Profile> profiles = List.of(
                stepan,
                victor,
                aleksey,
                lina
        );
        List<Address> expected = List.of(
                novoros,
                london,
                paris,
                moscow
        );
        Profiles prof = new Profiles();
        assertThat(expected, is(prof.collect(profiles)));
    }

    @Test
    public void whenListProfileToListAddressSorted() {
        Address novoros = new Address("Novorossiysk", "Lenina", 169, 55);
        Address londonOne = new Address("London", "Baker", 10, 25);
        Address londonTwo = new Address("London", "Baker", 10, 25);
        Address moscow = new Address("Moscow", "Red", 22, 58);
        Address rome = new Address("Rome", "Urbana", 10, 68);
        Address krasnodarOne = new Address("Krasnodar", "Phrunze", 20, 40);
        Address krasnodarTwo = new Address("Krasnodar", "Phrunze", 20, 40);

        Profile victor = new Profile(novoros);
        Profile alesOne = new Profile(londonOne);
        Profile alesTwo = new Profile(londonTwo);
        Profile lina = new Profile(moscow);
        Profile pavel = new Profile(rome);
        Profile petrOne = new Profile(krasnodarOne);
        Profile petrTwo = new Profile(krasnodarTwo);

        List<Profile> profiles = List.of(
                victor,
                alesOne,
                alesTwo,
                lina,
                pavel,
                petrOne,
                petrTwo
        );
        List<Address> expected = List.of(
                krasnodarOne,
                londonOne,
                moscow,
                novoros,
                rome
        );
        Profiles prof = new Profiles();
        assertThat(expected, is(prof.collectUniqueSorted(profiles)));
    }
}
