package ru.job4j.calculator;

/**
 * Класс Car рассчитывает сколько машина может проехать километрров.
 */
public class Car {
    private double volume;
// поле private пишется внутри класса.
    public void drive(int kilometer) {
        this.volume = this.volume - kilometer;
        // метод drive рассчитывает сколько километров машина проедет.
    }
    public void fill(int gas) {
        this.volume = this.volume + 10 * gas;
        // метод fill -  рассчитывае сколько топлива надо машине.
    }
    public boolean canDrive() {
        boolean result = this.volume > 0;
        return result;
    }
    public void gasInfo() {
        System.out.println("I can drive " + this.volume + " kilometers");
    }
}
