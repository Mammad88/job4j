package ru.job4j.oop;

/**
 *  Мы приводим конкретный тип к более общему типу данных - называется downcasting.
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $id$
 * @since 22.12.2019
 */

public class College {

    /**
     * class College.
     * method - main.
     * @param args аргументы.
     */
    public static void main(String[] args) {
        // создаем объект класса Freshman.
        Freshman freshman = new Freshman();
        // делаем приведение к типу родителя Student1.
        Student1 student1 = freshman;
        // делаем приведение к типу родителя Object.
        Object obj = freshman;

    }
}
