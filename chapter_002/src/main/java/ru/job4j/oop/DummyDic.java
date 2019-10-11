package ru.job4j.oop;

/**
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $id$
 * @since 11.10.2019
 * class -  DummyDic.
 */

public class DummyDic {
    /**
     * method engTorus.
     * @return eng - английское слово.
     */
    public String engToRus() {
        String eng = "Hashcode";
        return eng;
    }
    public static void main(String[] args) {
        /**
         * создание объекта DummyDic.
         * объект вызывает метод engToRus.
         * выводит на консоль Неизвестное слово - 'Hashcode".
         */
        DummyDic dummy = new DummyDic();
        String eng = dummy.engToRus();
        System.out.println("Неизвестное слово - " + eng);
    }
}

