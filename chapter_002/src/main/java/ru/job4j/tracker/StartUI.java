package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $4.0$
 * @since 03.03.2020
 */
public class StartUI {

    /**
     * Цикл программы, в ходе которого проверяется пользовательский ввод и отоброжаются результаты.
     */

    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.size());
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    /**
     * Отображает меню перед вводом значений.
     */

    private void showMenu(List<UserAction> actions) {
        System.out.println("Menu.");
        for (UserAction action : actions) {
            System.out.println(actions.size() - 1 + ". " + action.name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction());
        new StartUI().init(validate, tracker, actions);
    }
}
