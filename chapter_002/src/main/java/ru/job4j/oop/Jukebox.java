package ru.job4j.oop;
/**
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $id$
 * @since 11.10.2019
 * class - Jukebox.
 */
public class Jukebox {
    /**
     * class - Jukebox.
     * method music - обрабатывает список песен.
     * @param position - позиция.
     */
    public void music (int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже.");
        } else if (position == 2) {
            System.out.println("Спокойной ночи.");
        } else {
            System.out.println("Песня не найдена.");
        }
    }

    public static void main(String[] args) {
        Jukebox juk = new Jukebox();
        int position = 2;
        juk.music(position);
    }
}
