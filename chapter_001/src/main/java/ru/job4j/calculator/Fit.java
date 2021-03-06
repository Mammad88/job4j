package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 */
public class Fit {
    /**
     * Идеальный вес для мужщины.
     * @param  height - рост в сантиметрах.
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        return (height - 100) * 1.15;
    }
    /**
     * Идеальный вес для женщины.
     * @param height рост в сантиметрах.
     * @return идеальный вес.
     */
    public double womanWeight(double height) {
        return (height - 110) * 1.15;
    }
}
