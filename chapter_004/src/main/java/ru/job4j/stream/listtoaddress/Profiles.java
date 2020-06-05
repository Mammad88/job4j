package ru.job4j.stream.listtoaddress;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version 1.0
 * @since 05.06.2020
 */
public class Profiles {

    /**
     * Метод преобразует список профилей в список адресов.
     *
     * @param profiles список профилей.
     * @return список адресов.
     */
    List<Address> collect(List<Profile> profiles) {
        List<Address> list = profiles.stream().map(Profile::getAddress).collect(Collectors.toList());
        return list;
    }

    /**
     * Метод преобразует список профилей в список адресов, возвращает только уникальные элементы, отсортированные по городу.
     *
     * @param profiles список профилей.
     * @return список адресов.
     */
    List<Address> collectUniqueSorted(List<Profile> profiles) {
        List<Address> list = profiles.stream().map(Profile::getAddress)
                .sorted(Comparator.comparing(Address::getCity))
                .distinct().collect(Collectors.toList());
        return list;
    }
}
