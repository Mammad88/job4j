package ru.job4j.oop;

/**
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $id$
 * @since 10.10.2019
 * class - Cat.
 * Создание объекта типа Cat.
 */
public class Cat {
    private String name;

    public void show() {
        System.out.println("ел " + this.name);
    }

    public void eat(String meat) {
        this.name = meat;
           }

    public void giveNick(String nick) {
        this.name = nick;
        System.out.println(nick);
    }
    public static void main(String[] args) {


        Cat gav = new Cat();

        gav.giveNick("Tom");
        gav.eat("cutlet ");
        gav.show();

        Cat black = new Cat();
        gav.giveNick("Joni");
        black.eat("fish");
        black.show();
    }
}
