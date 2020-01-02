package ru.job4j.tracker;

/**
 * @author Bruki Mammad (bruki_mammd@mail.ru)
 * @version $Id$
 * @since 02.01.2020
 */

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by Id ===";
    }

    /**
     * class findByIdAction - проводит поиск заявки по id.
     *
     * @param input   - ввод данных.
     * @param tracker - хранилище заявок.
     */

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        Item item = tracker.findById(id);
        if (item == null) {
            System.out.println("========= Заявка не найдена! ========");
        } else {
            System.out.println("========== Заявка найдена! ==========");
            System.out.println("Получение заявки по id: " + item.getId());
        }
        return true;
    }
}
