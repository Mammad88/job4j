package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Класс в котором происходит основная логика программы добавления-удаления заявки.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $4.0$
 * @since 28.02.2020
 */
public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final List<Item> items = new ArrayList<>();

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод, который добалвяет элемент в массив.
     *
     * @param item - элемент, который нам нужно добавить.
     *             return - добавление элемента.
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items.add(item);
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Метод findById с помощью которого  мы можем найти элемент по id.
     *
     * @param id идентификатор элемента, который мы ищем.
     * @return элемент Item, либо null.
     */

    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    /**
     * Метод возвращает копию массива без null элементов.
     *
     * @return копию массива.
     */

    public List<Item> findAll() {
        return items.subList(0, items.size());
    }

    /**
     * Метод в котором ищем заявки по имени.
     *
     * @param key -  ввод имени для поиска.
     * @return массив найденных заявок.
     */

    public List<Item> findByName(String key) {
        List<Item> nameList = new ArrayList<>();
        for (Item item : items) {
            if (item != null && item.getName().equals(key)) {
                nameList.add(item);
            }
        }
        return nameList;
    }

    /**
     * Метод заменяет ячейку в массиве.
     *
     * @param id   заменяемой ячейки.
     * @param item новая заявка.
     * @return удалось ли заменить.
     */

    public boolean replace(String id, Item item) {
        boolean result = false;
        item.setId(id);
        int count = 0;
        for (Item i : items) {
            if (item.getId().equals(id)) {
                items.set(count, item);
                result = true;
                break;
            }
            count++;
        }
        return result;
    }

    /**
     * Метод удаляет ячейку в массиве и сдвигает пустую ячейку в конец массива.
     *
     * @param id удаляемая ячейка.
     * @return удалось ли удалить.
     */
    public boolean delete(String id) {
        boolean result = false;
        int count = 0;
        for (Item item : items) {
            if (item.getId().equals(id)) {
                items.remove(count);
                result = true;
                break;
            }
            count++;
        }
        return result;
    }
}
