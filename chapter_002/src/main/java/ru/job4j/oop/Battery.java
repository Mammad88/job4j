package ru.job4j.oop;
/**
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $id$
 * @since 18.10.2019
 * class -  Battery.
 */
public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

    /**
     * method exchange - списывает  заряд из батареи у кого вызывали  и добавляет к объекту another.
     * @param another - another.
     */

    public void exchange(Battery another) {
        this.load = this.load + another.load;
        another.load = 0;
    }

    /**
     * Создание объекта first и second типа Battery.
     * @param args - args.
     * вызов метода exchange.
     */

    public static void main(String[] args) {
        Battery first = new Battery(15);
        Battery second = new Battery(5);
        System.out.println("first : " + first.load + ". second : " + second.load);
        first.exchange(second);
        System.out.println("first : " + first.load + ". second : " + second.load);
    }
}
