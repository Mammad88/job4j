package ru.job4j.stragery;

/**
 * @author Bruki Mammad (bruki_mammd@mail.ru)
 * @version $2.0$
 * @since 02.01.2020
 */

public class Square implements Shape {

    @Override
    public String draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("+ + + +");
        builder.append("+     +");
        builder.append("+     +");
        builder.append("+ + + +");
        return builder.toString();
    }
}
