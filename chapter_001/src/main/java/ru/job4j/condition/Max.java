package ru.job4j.condition;

/**
 * Max.
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $id$
 * @since 19.10.2019
 */
public class Max {
    /**
     * class - Max.
     * @param first - первое число.
     * @param second - второе число.
     * @return - возвращает максимальное число.
     */
    public int max(int first, int second) {
        /**
         * method max.
         * сравнивает: если first  > second, то возврашает first, иначе second.
         */
        int result = first > second ? first : second;
        return result;
    }

    public int max(int first, int second, int third) {
        return this.max((this.max(first, second)), third);
    }

    public int max(int first, int second, int third, int four) {
        return this.max((this.max(first, second, third)), four);
    }
}
