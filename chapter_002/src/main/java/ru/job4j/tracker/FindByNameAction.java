package ru.job4j.tracker;

/**
 * @author Bruki Mammad (bruki_mammd@mail.ru)
 * @version $Id$
 * @since 02.01.2020
 */

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ===";
    }

    /**
     * class FindByNameAction - проводит поиск заявки по имени.
     *
     * @param input   - ввод данных.
     * @param tracker - хранилище заявок.
     */

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] targetItems = tracker.findByName(name);
        if (targetItems.length == 0) {
            System.out.println("--- По имени " + name + " заявки не найдены! ---");
        } else {
            System.out.println("--- По имени " + name + " найдены следующие заявки: ---");
        }

        for (Item items : targetItems) {
            System.out.println("Получение заявки по имени: " + items.getName());
        }
        return true;
    }
}
