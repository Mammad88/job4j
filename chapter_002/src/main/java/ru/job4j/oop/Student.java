package ru.job4j.oop;
/**
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $id$
 * @since 12.10.2019
 * class -  Student.
 */
public class Student {
    /**
     * method music - играет на баяне.
     */
    public void music() {
        System.out.println("Tra tra tra");
    }
    /**
     * method song - поет песни.
     */
    public void song() {
        System.out.println("I believe I can fly");
    }
    /**
     * создание  объекта Student.
     * @param args - аргументы.
     * Петя играет на баяне три раза.
     * Петя поет песни три раза.
     */
    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.song();
        petya.song();
        petya.song();
    }
}
