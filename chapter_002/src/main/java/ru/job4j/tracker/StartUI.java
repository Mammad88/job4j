package ru.job4j.tracker;

/**
 * @author Bruki Mammad (bruki_mammd@mail.ru)
 * @version $3.0$
 * @since 21.01.2020
 */
public class StartUI {

    /**
     * Цикл программы, в ходе которого проверяется пользовательский ввод и отоброжаются результаты.
     */

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", 6);
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    /**
     * Отображает меню перед вводом значений.
     */

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        actions = new UserAction[]{new CreateAction(), new DeleteAction(), new EditAction(), new FindAllAction(), new FindByNameAction(), new FindByIdAction()};
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction()
        };
        new StartUI().init(validate, tracker, actions);
    }
}
