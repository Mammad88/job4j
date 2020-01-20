package ru.job4j.tracker;

/**
 * @author Bruki Mammad (bruki_mammd@mail.ru)
 * @version $Id$
 * @since 20.01.2020
 */

public class ValidateStubInput extends ValidateInput {
    private String[] data;
    private int position;

    public ValidateStubInput(String[] data) {
        this.data = data;
    }

    @Override
    public String askStr(String question) {
        return data[position++];
    }
}
