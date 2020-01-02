package ru.job4j.tracker;

/**
 * @author Bruki Mammad (bruki_mammd@mail.ru)
 * @version $Id$
 * @since 02.01.2020
 */

public class EditAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit item ===";
    }

    /**
     * class EditAction - меняет ячейку в массиве требуемой ячейкой.
     *
     * @param input   - ввод данных.
     * @param tracker - хранилище заявок.
     */

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Введите ID редактируемой заявки: ");
        String name = input.askStr("Введите новое имя заявки: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Item has been edited!");
        } else {
            System.out.println("Item was not found!");
        }
        return true;
    }
}
