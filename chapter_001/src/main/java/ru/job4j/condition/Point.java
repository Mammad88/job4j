package ru.job4j.condition;

import java.awt.event.WindowFocusListener;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
/**
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $id$
 * @since 20.10.2019
 * class Point - описывает расстояние между точками в системе координат.
 */
public class Point {
    /**
     * Это поле объекта. Оно доступно только конкретному объекту.
     */
    private int x;

    /**
     * И это поле объекта. Оно доступно только конкретному объекту.
     */
    private int y;
    /**
     * Создаем поле объекта z оно доступно только конретному объекту.
     */
    private int z;
    /**
     * Конструтор, который принимает начальное состояние объекта "точка"
     * @param first координата x
     * @param second координата y
     */

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Создаем новый конструктор, который принимает три координаты.
     * @param x - точка x.
     * @param y - точка y.
     * @param z - точка z.
     */
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    /**
     * method distance3d.
     * @param that - that.
     * @return - подсчет расстояния между точками в трехмерном пространстве.
     */

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }
}
