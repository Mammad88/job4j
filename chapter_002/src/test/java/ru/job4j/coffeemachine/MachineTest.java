package ru.job4j.coffeemachine;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MachineTest {

    /**
     * Когда мы внесли в автомат 100 рублей и выбрали кофе за 100, сдача -  о рублей.
     */
    @Test
    public void whenEquals() throws NeedMoreMoneyException {
        Machine machine = new Machine();
        int[] expected = {};
        int[] rsl = machine.changes(100, 100);
        assertThat(rsl, is(expected));
    }

    /**
     * Когда мы внесли 50 рублей выбрали кофе за 35. Сдача - 15 рублей.
     */
    @Test
    public void when50by35() throws NeedMoreMoneyException {
        Machine machine = new Machine();
        int[] expected = {10, 5};
        int[] rsl = machine.changes(50, 35);
        assertThat(rsl, is(expected));
    }

    /**
     * Проверка когда денег не хватает.
     */
    @Test(expected = NeedMoreMoneyException.class)
    public void whenBuyCoffeeFor70NeedChanges50ThenGetException() throws NeedMoreMoneyException {
        Machine machine = new Machine();
        int[] expected = {};
        int[] rsl = machine.changes(50, 70);
        assertThat(rsl, is(expected));
    }

    /**
     * Когда мы внесли 50 рублей и выбрали кофе за 27. Сдачу автомат должен дать 23 рублей.
     */
    @Test
    public void whenBuyCoffeeFor27NeedChanges50ThenGetChange() throws NeedMoreMoneyException {
        Machine machine = new Machine();
        int[] expected = {10, 10, 2, 1};
        int[] rsl = machine.changes(50, 27);
        assertThat(rsl, is(expected));
    }
}

