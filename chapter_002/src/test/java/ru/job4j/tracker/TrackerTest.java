package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenFindAllThenReturnAll() {
        Tracker tracker = new Tracker();
        // Создаем три заявки и добавляем их все в трекер. Каждая получает уникальный id.
        Item first = new Item("test1");
        tracker.add(first);
        Item second = new Item("test2");
        tracker.add(second);
        Item third = new Item("test3");
        tracker.add(third);
        // Создаем ожидаемый массив класса Item.
        Item[] expected = new Item[3];
        expected[0] = first;
        expected[1] = second;
        expected[2] = third;
        // Проверяем, что массив, передаваемый через метод findAll и ожидаемый массив равны.
        assertThat(tracker.findAll(), is(expected));
    }

    @Test
    public void whenFindByIdThenReturnItem() {
        Tracker tracker = new Tracker();
        // Создаем три заявки и добавляем их все в трекер. Каждая получает уникальный id.
        Item first = new Item("123L",  "test1");
        tracker.add(first);
        Item second = new Item("234L",  "test2");
        tracker.add(second);
        Item third = new Item("456L", "test3");
        tracker.add(third);
        // Создаем объект класса Item и присваеваем ему id одного из элементов добавленных в трекер.
        Item expected = new Item("234L",  "test2");
        expected.setId(second.getId());
        // Сравниваем, что имя возвращенного элемента методом findById равно имени ожидаемого элемента.
        assertThat(tracker.findById(second.getId()).getName(), is("test2"));
    }

    @Test
    public void whenFindByNameThenReturnByName() {
        Tracker tracker = new Tracker();
        // Создаем три заявки и добавляем их все в трекер. Каждая получает уникальный id, две имеют одинаковое имя.
        Item first = new Item("123L", "test1");
        tracker.add(first);
        Item second = new Item("234L", "test2");
        tracker.add(second);
        Item third = new Item("456L", "test2");
        tracker.add(third);
        // Создаем ожидаемый массив класса Item из двух элементов с одинаковым именем.
        Item[] expected = new Item[2];
        expected[0] = second;
        expected[1] = third;
        // Проверяем, что массив, передаваемый через метод findAll и ожидаемый массив равны.
        assertThat(tracker.findByName("test2"), is(expected));
    }
}
