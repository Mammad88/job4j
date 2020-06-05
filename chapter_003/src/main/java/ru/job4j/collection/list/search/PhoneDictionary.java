package ru.job4j.collection.list.search;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * class  PhoneDictionary - Телефонный справочник.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version 3.0
 * @since 05.06.20
 */
public class PhoneDictionary {

    private ArrayList<Person> persons = new ArrayList<Person>();

    /**
     * конструктор по умолчанию.
     */
    public PhoneDictionary() {
    }

    /**
     * method add - добавляет пользователя в коллекцию persons.
     *
     * @param person - пользователь.
     */
    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * Predicate<Person> combine - функция высшего порядка.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> combName = person -> person.getName().contains(key);
        Predicate<Person> combSurname = person -> person.getSurname().contains(key);
        Predicate<Person> combAddress = person -> person.getAddress().contains(key);
        Predicate<Person> combPhone = person -> person.getPhone().contains(key);
        Predicate<Person> combine = combName.or(combSurname).or(combAddress).or(combPhone);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }

    /**
     * Проверяяем наличие ключевого слова в полях пользователя.
     *
     * @param person пользователь
     * @param key    ключевое слово
     * @return true, если ключ содержится хотя бы в одном из полей
     */
//    private boolean contains(Person person, String key) {
//        return person.getName().contains(key)
//                || person.getSurname().contains(key)
//                || person.getAddress().contains(key)
//                || person.getPhone().contains(key);
//    }
}
