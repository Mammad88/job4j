package ru.job4j.collection.list.search;

import java.util.ArrayList;

/**
 * class  PhoneDictionary - Телефонный справочник.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version 0.1
 * @since 23.02.20
 */
public class PhoneDictionary {

    private ArrayList<Person> persons = new ArrayList<Person>();

    public PhoneDictionary() {
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : this.persons) {
            if (this.contains(person, key)) {
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
    private boolean contains(Person person, String key) {
        return person.getName().contains(key)
                || person.getSurname().contains(key)
                || person.getAddress().contains(key)
                || person.getPhone().contains(key);
    }
}
