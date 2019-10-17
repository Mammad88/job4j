package ru.job4j.oop;

/**
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $id$
 * @since 17.10.2019
 * class -  BallStory.
 * Создание объуктов типа: Ball, Hare, Wolf, Fox.
 */
public class BallStory {

    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();

        hare.tryEat(ball);
        System.out.println("Заяц хочет съест колобка!");
        wolf.tryEat(ball);
        System.out.println("Волк хочет съест колобка!");
        fox.tryEat(ball);
        System.out.println("Лиса хочет съест колобка!");
    }
}
