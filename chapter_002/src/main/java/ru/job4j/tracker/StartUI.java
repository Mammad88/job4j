package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = false;
        while (!run) {
            this.showMenu();
            int select = input.askInt("Select: ");

            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Введите имя заявки: ");
                Item item = new Item(name);
                System.out.println("Добавление новой заявки: " + item);
                tracker.add(item);

            } else if (select == 1) {
                System.out.println("=== Show all items ===");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                System.out.println("Список всех заявок: " + item);
                tracker.findAll();

            } else if (select == 2) {
                 System.out.println("=== Edit item ===");
                 String id = input.askStr("Введите ID редактируемой заявки: ");
                 String name = input.askStr("Введите новое имя заявки: ");
                 Item item = new Item(name);
                 if (tracker.replace(id, item)) {
                     System.out.println("Item has been edited!");
                 } else {
                     System.out.println("Item was not found!");
                 }

            } else if (select == 3) {
                System.out.println("=== Delete item ===");
                String name = input.askStr("Enter name: ");
                String id = input.askStr("Enter id: ");
                Item item = new Item(id, name);
                System.out.println("Удаление заявки: " + item);
                tracker.delete(id);

            } else if (select == 4) {
                System.out.println("=== Find item by Id ===");
                String id = input.askStr("Enter id: ");
                Item item = tracker.findById(id);
                if (item == null) {
                    System.out.println("========= Заявка не найдена! ========");
                } else {
                    System.out.println("========== Заявка найдена! ==========");
                    System.out.println("Получение заявки по id: " + item.getId());
                }

            } else if (select == 5) {
                System.out.println("=== Find items by name ===");
                String name = input.askStr("Enter name: ");
                Item[] targetItems  = tracker.findByName(name);
                if (targetItems.length == 0) {
                    System.out.printf("--- По имени %s%s%s%s%n", "\"", name, "\"", " заявки не найдены! ---");
                } else {
                    System.out.printf("--- По имени %s%s%s%s%n", "\"", name, "\"", " найдены следующие заявки: ---");
                }
                for (Item items: targetItems) {
                    System.out.println("Получение заявки по имени: " + items.getName());
                }

            } else if (select == 6) {
                System.out.println("=== Exit Program ===");
                run = true;
            }
        }
    }

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
        new StartUI().init(input, tracker);
    }
}
