package ru.job4j.stragery;

import java.util.StringJoiner;

/**
 * @author Bruki Mammad (bruki_mammd@mail.ru)
 * @version $2.0$
 * @since 02.01.2020
 */

public class Triangle implements Shape {

    @Override
    public String draw() {
        StringJoiner sb = new StringJoiner(System.lineSeparator());
        sb.add("   +   ");
        sb.add("  + +  ");
        sb.add(" +   + ");
        sb.add("+ + + +");
        return sb.toString();
    }
}
