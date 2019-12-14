package ru.job4j.tracker;

import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище.
     * @param item новая заявка.
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Метод findById выполняет поиск заявок по id.
     * @param id.
     * @return result.
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item: items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    /**
     * Метод выводит список всех заявок.
     * @return result.
     */

    public Item[] findAll() {
        Item[] result = new Item[position];
        for (int index = 0; index != this.position; index++) {
            result[index] = this.items[index];
        }
        return result;
    }

    /**
     * Поиск заявок по наименованию и копирование их в массив.
     * @param key -  ввод имени для поиска.
     * @return список заявок.
     */
    public Item[] findByName(String key) {
        Item[] temp = new Item[position];
        int count = 0;
        for (int index = 0; index < position; index++) {
            if (this.items[index].getName().equals(key)) {
                temp[count] = this.items[index];
                count++;
            }
        }
        Item[] listOfNames = new Item[count];
        for (int index = 0; index < count; index++) {
            listOfNames[index] = temp[index];
        }
        return  listOfNames;
    }
}
