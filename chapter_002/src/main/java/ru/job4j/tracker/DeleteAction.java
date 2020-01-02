package ru.job4j.tracker;

/**
 * @author Bruki Mammad (bruki_mammd@mail.ru)
 * @version $Id$
 * @since 02.01.2020
 */

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ===";
    }

    /**
     * class DeleteAction - удаляет заявки по id.
     *
     * @param input   - ввод данных.
     * @param tracker - хранилище заявок.
     */

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("Item has been deleted!");
        } else {
            System.out.println("Item was not found!");
        }
        return true;
    }
}
