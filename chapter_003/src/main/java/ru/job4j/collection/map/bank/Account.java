package ru.job4j.collection.map.bank;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * class Account - банковский счет.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version 1.0
 * @since 21.03.2020
 */
public class Account {
    /**
     * Реквизиты.
     */
    private String requisite;
    /**
     * Баланс счета.
     */
    private BigDecimal value;

    public Account(String requisite, BigDecimal value) {
        this.requisite = requisite;
        this.value = value;
    }

    public String getRequisite() {
        return requisite;
    }

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }

    /**
     * Перевод средств со счета отправителя получателю.
     *
     * @param dest   Счет получателя.
     * @param amount Сумма.
     * @return Прошел ли перевод.
     */

    public boolean transfer(Account dest, BigDecimal amount) {
        boolean result = false;
        if (this.value.compareTo(amount) >= 0) {
            this.value = this.value.subtract(amount);
            dest.value = dest.value.add(amount);
            result = true;
        }
        return result;
    }
}
