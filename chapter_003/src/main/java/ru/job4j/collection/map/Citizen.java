package ru.job4j.collection.map;

import java.util.Objects;

/**
 * class Citizen - информация о гражданине.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version 1.0
 * @since 18.03.2020
 */
public class Citizen {
    /**
     * Серия и номер паспорта
     */
    private String passport;
    /**
     * ФИО гражданина
     */
    private String username;

    public Citizen(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    public String getPassport() {
        return passport;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Citizen citizen = (Citizen) o;
        return Objects.equals(passport, citizen.passport) && Objects.equals(username, citizen.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport, username);
    }
}
