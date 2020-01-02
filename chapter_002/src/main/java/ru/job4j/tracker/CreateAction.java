package ru.job4j.tracker;

/**
 * @author Bruki Mammad (bruki_mammd@mail.ru)
 * @version $Id$
 * @since 02.01.2020
 */

public class CreateAction implements UserAction {
    @Override
    public String name() {
        return "=== Create a new Item === ";
    }

    /**
     * class CreateAction - реализует добавление новой заявки в хранилище.
     *
     * @param input   - ввод данных.
     * @param tracker - хранилище заявок.
     */

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.print("Enter name: ");
        String name = input.askStr("");
        Item item = new Item(name);
        tracker.add(item);
        return true;
    }
}
