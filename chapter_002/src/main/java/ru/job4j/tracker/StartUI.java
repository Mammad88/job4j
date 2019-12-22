package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = false;
        while (!run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());

            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Введите имя заявки: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                System.out.println("Добавление новой заявки: " + item);
                tracker.add(item);

            } else if (select == 1) {
                System.out.println("=== Show all items ===");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                System.out.println("Список всех заявок: " + item);
                tracker.findAll();

            } else if (select == 2) {
                 System.out.println("=== Edit item ===");
                 System.out.println("Введите ID редактируемой заявки: ");
                 String id = scanner.nextLine();
                 System.out.println("Введите новое имя заявки: ");
                 String name = scanner.nextLine();
                 Item item = new Item(name);
                 if (tracker.replace(id, item)) {
                     System.out.println("Item has been edited!");
                 } else {
                     System.out.println("Item was not found!");
                 }

            } else if (select == 3) {
                System.out.println("=== Delete item ===");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                System.out.println("Enter id: ");
                String id = scanner.nextLine();
                Item item = new Item(id, name);
                System.out.println("Удаление заявки: " + item);
                tracker.delete(id);

            } else if (select == 4) {
                System.out.println("=== Find item by Id ===");
                System.out.println("Enter id: ");
                String id =  scanner.nextLine();
                Item item = tracker.findById(id);
                if (item.getName().contains("null")) {
                    System.out.println("========= Заявка не найдена! ========");
                } else {
                    System.out.println("========== Заявка найдена! ==========");
                    System.out.println("Получение заявки по id: " + item.getId());
                }

            } else if (select == 5) {
                System.out.println("=== Find items by name ===");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);

    }
}
