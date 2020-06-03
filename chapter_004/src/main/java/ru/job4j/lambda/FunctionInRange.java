package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Implementing a function count in a range.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version 0.1$
 * @since 03.06.2020
 */
public class FunctionInRange {
    public List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> result = new ArrayList<>();
        for (int index = start; index != end; index++) {
            result.add(
                    func.apply((double) index)
            );
        }
        return result;
    }
}
