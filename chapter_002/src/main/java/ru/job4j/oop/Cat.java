package ru.job4j.oop;

/**
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $id$
 * @since 17.10.2019
 * class - Cat.
 * Создание поля String name.
 */
public class Cat {
    private String name;

    /**
     * method show - показывает имя котика и что он ел.
     */
    public void show() {
        System.out.println("ел " + this.name);
    }

    /**
     * method eat.
     * @param meat - мясо.
     */
    public void eat(String meat) {
        this.name = meat;
    }

    /**
     * method  giveNick - хранит nick Cat.
     * @param nick - nick.
     */
    public void giveNick(String nick) {
        this.name = nick;
        System.out.println(nick);
    }
    public static void main(String[] args) {
        /**
         * Создание объекта gav типа Cat.
         */
        Cat gav = new Cat();
        gav.giveNick("Tom");
        gav.eat("cutlets ");
        /**
         * Создание объекта black типа Cat.
         */
        gav.show();
        Cat black = new Cat();
        gav.giveNick("Joni");
        black.eat("fish");
        black.show();
    }
}
