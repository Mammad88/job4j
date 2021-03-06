package ru.job4j.collection.map.bank;

import java.util.Objects;

/**
 * class User - пользователь банка.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version 1.0
 * @since 21.03.2020
 */
public class User {
    /**
     * Паспортные данные.
     */
    private String passport;
    /**
     * полное имя пользователя.
     */
    private String username;

    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
