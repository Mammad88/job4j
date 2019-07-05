package ru.job4j.condition;
/**
 * MultiMax.
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $id$
 * @since 05.07.2019
 */
public class MultiMax {
    public int max(int first, int second, int third) {
        /**
         * Method - max.
         */
        int result = first > second ? first : second;
        // if first > second то return first иначе  return second.
        return result > third ? result : third;
        // If result > third то return result, иначе return third.
    }
}

