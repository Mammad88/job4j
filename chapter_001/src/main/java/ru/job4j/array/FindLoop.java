package ru.job4j.array;

/**
 * @author Bruki Mammad.
 * @version $id$
 * @since 27.07.2019
 */
public class FindLoop {
    /**
     * class - FindLoop.
     * Найти индекс элемента, удовлетворяющий условию.
     * @param data - список элементов.
     * @param el - индекс, который нужно найти.
     * @return rst - индекс элемента удовлетворяющий условию.
     */
    public int indexOf(int[] data, int el) {
        // если элемента нет в массиве, то возвращаем -1.
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
