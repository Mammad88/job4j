package ru.job4j.tracker;

/**
 * @author Bruki Mammad (bruki_mammd@mail.ru)
 * @version $Id$
 * @since 02.01.2020
 */

public interface UserAction {
    String name();

    boolean execute(Input input, Tracker tracker);
}
