package ru.job4j.tracker;

public class StartUI {
    /**
     * method createItem - реализует добавление новой заявки в хранилище.
     *
     * @param input   - ввод данных.
     * @param tracker - хранилище заявок.
     */

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        System.out.print("Enter name: ");
        String name = input.askStr("");
        Item item = new Item(name);
        tracker.add(item);
    }

    /**
     * метод showAllItems - отображает все созданные заявки.
     *
     * @param input   - ввод данных.
     * @param tracker - хранилище заявок.
     */

    public static void showAllItems(Input input, Tracker tracker) {
        System.out.println("=== Show all items ===");
        String name = input.askStr("Enter name: ");
        Item[] targetItem = tracker.findAll();
        for (Item items : targetItem) {
            System.out.println("Список всех заявок: " + items.getName());
        }
    }

    /**
     * метод editItem - меняет ячейку в массиве требуемой ячейкой.
     *
     * @param input   - ввод данных.
     * @param tracker - хранилище заявок.
     */

    public static void editItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ===");
        String id = input.askStr("Введите ID редактируемой заявки: ");
        String name = input.askStr("Введите новое имя заявки: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Item has been edited!");
        } else {
            System.out.println("Item was not found!");
        }
    }

    /**
     * метод deleteItem - удаляет заявки по id.
     *
     * @param input   - ввод данных.
     * @param tracker - хранилище заявок.
     */

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        String id = input.askStr("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("Item has been deleted!");
        } else {
            System.out.println("Item was not found!");
        }
    }

    /**
     * метод findByid - проводит поиск заявки по id.
     *
     * @param input   - ввод данных.
     * @param tracker - хранилище заявок.
     */

    public static void findById(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ===");
        String id = input.askStr("Enter id: ");
        Item item = tracker.findById(id);
        if (item == null) {
            System.out.println("========= Заявка не найдена! ========");
        } else {
            System.out.println("========== Заявка найдена! ==========");
            System.out.println("Получение заявки по id: " + item.getId());
        }
    }

    /**
     * метод findByName - проводит поиск заявки по имени.
     *
     * @param input   - ввод данных.
     * @param tracker - хранилище заявок.
     */

    public static void findByName(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ===");
        String name = input.askStr("Enter name: ");
        Item[] targetItems = tracker.findByName(name);
        if (targetItems.length == 0) {
            System.out.printf("--- По имени %s%s%s%s%n", "\"", name, "\"", " заявки не найдены! ---");
        } else {
            System.out.printf("--- По имени %s%s%s%s%n", "\"", name, "\"", " найдены следующие заявки: ---");
        }
        for (Item items : targetItems) {
            System.out.println("Получение заявки по имени: " + items.getName());
        }
    }

    /**
     * Цикл программы, в ходе которого проверяется пользовательский ввод и отоброжаются результаты.
     */

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");

            if (select == 0) {
                StartUI.createItem(input, tracker);

            } else if (select == 1) {
                StartUI.showAllItems(input, tracker);

            } else if (select == 2) {
                StartUI.editItem(input, tracker);

            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);

            } else if (select == 4) {
                StartUI.findById(input, tracker);

            } else if (select == 5) {
                StartUI.findByName(input, tracker);

            } else if (select == 6) {
                System.out.println("=== Exit Program ===");
                run = false;
            }
        }
    }

    /**
     * Отображает меню перед вводом значений.
     */

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        //Вызов не статического метода. Необходимо обратиться через объект.
        new StartUI().init(input, tracker);
        // Вызов статического метода. Обращаемся через класс.
        StartUI.createItem(input, tracker);
    }
}
