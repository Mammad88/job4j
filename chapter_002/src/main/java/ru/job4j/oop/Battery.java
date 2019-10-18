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
     * method exchange -  списывает заряд из батареи у кого вызывали метод exchange и добавляет к объекту another.
     * @param another - another.
     */
    public void exchange(Battery another) {
        this.load =  this.load + another.load;
        another.load = 0;
    }

    /**
     * Создание объектов first и  second типа Battery.
     * @param args - args.
     */

    public static void main(String[] args) {
        Battery first = new Battery(80);
        Battery second = new Battery(20);
        System.out.println("first : " + first.load + ". second : " + second.load);
        first.exchange(second);
        System.out.println("first : " + first.load + ". second : " + second.load);
    }
}
