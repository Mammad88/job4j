package ru.job4j.calculator;

public class Calculator {
    /**
     * Calculator.
     * @author Bruki Mammad (bruki_mammad@mail.ru)
     * @version $id$
     * @since 28.06.2019
     */
    public double add(double first, double second) {
        return first + second;
    }
    /**
     * Method add - складывает параметр  first и second.
     * @return value
     */

    public double subtract(double first, double second) {
        return first - second;
    }
    /**
     * Method subtract -  из параметра first вычитает second.
     * @return value.
     */
    public double div(double first, double second) {
        return first / second;
    }
    /**
     * Method div - делить параметр first на second.
     * @return value.
     */
    public double multiple(double first, double second) {
        return first * second;
    }
}
