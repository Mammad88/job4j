package ru.job4j.collection.set;

import java.util.Objects;

/**
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version 1.0
 * @since 16.03.2020
 * class Account - модель данных клиента банка.
 * passport - серия и номер паспорта.
 * username - поное имя клиента.
 * deposit - номер счета клиента.
 */
public class Account {
    private String passport;
    private String username;
    private String deposit;

    public Account(String passport, String username, String deposit) {
        this.passport = passport;
        this.username = username;
        this.deposit = deposit;
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
        return Objects.equals(passport, account.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }

    @Override
    public String toString() {
        return "Account{" + "passport='" + passport + '\'' + ", username='" + username + '\'' + ", deposit='" + deposit + '\'' + '}';
    }
}