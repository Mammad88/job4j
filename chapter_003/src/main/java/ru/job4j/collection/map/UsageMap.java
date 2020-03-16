package ru.job4j.collection.map;

import java.util.HashMap;

/**
 * class UsageMap - изучение  интерфейса HashMap. .
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version 3.0
 * @since 16.03.2020
 */
public class UsageMap {
    public static void main(String[] args) {
        // Создание коллекций HashMap<String, String>.
        HashMap<String, String> map = new HashMap<>();
        // Добавление почты в качестве ключа и ФИО в качестве значения.
        map.put("Alexyanovsky@mail.ru", "Alex Yanovsky");
        map.put("bruki_mammad@mail.ru", "Bruki Mammad");
        //  Удаление происходит по ключу через метод remove(key);
        map.remove("bruki_mammad@mail.ru");
        // Вывед всех элементов на печать или интегрироваться по элементам.
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
