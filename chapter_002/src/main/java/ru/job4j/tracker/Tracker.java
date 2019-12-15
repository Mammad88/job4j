package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;
import static java.util.Arrays.*;

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
     * Создаем новый метод, который будет возвращать индекс по id
     */

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод findById возвращает элемент по id, либо null.
     * @param id скомого элемента.
     * @return элемент Item, либо null.
     */

    public Item findById(String id) {
        int i = indexOf(id);
        if (i != -1) {
            return items[i];
        }
        return  null;
    }

    /**
     * Метод возвращает копию массива без null элементов.
     * @return копию массива.
     */

    public Item[] findAll() {
        return copyOf(items, position);
    }

    /**
     * Поиск заявок по наименованию и копирование их в массив.
     * @param key -  ввод имени для поиска.
     * @return новый массив.
     */

    public Item[] findByName(String key) {
        Item[] result = new Item[position];
        int count = 0;
        for (int index = 0; index < position; index++) {
            if (this.items[index].getName().equals(key)) {
                result[count] = this.items[index];
                count++;
            }
        }
        return Arrays.copyOf(result, count);
    }

    /**
     * Метод заменяет ячейку в массиве.
     * @param id заменяемой ячейки.
     * @param item новая заявка.
     * @return удалось ли заменить.
     */

    public boolean replace(String id, Item item) {
        boolean result = false;
        item.setId(id);
        for (int i = 0; i < position; i++) {
            if (items[i].getId().equals(id)) {
                items[i] = item;
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод удаляет ячейку в массиве и сдвигает пустую ячейку в конец массива.
     * @param id удаляемая ячейка.
     * @return удалось ли удалить.
     */
    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i < position; i++) {
            if (items[i].getId().equals(id)) {
                result = true;
                System.arraycopy(items, i + 1, items, i, position - i);
                position--;
                break;
            }
        }
        return result;
    }
}
