package ru.job4j.calculator;

/**
 * class Size.
 */
public class Size {
    /**
     * Метод add складывает left и right.
     * @param left - левый.
     * @param right - проавый.
     * @return result.
     */
    public int add(int left, int right) {
    int result = left + right;
    return result;
    }

    /**
     * Метод info - выводить информацию на консоль.
     * @param size - размер.
     */
    public void info(int size) {
    System.out.println("Your size is: " + size);
    }

    /**
     * метод main.
     * @param args - аргументы.
     */
    public static void main(String[] args) {
    Size size = new Size();
    int nike = 10;
    int puma = 50;
    int value = size.add(nike, puma);
    // складывает методом add, nike и puma.
    size.info(value);
    }
}


