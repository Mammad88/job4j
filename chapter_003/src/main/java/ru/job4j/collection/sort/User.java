package ru.job4j.collection.sort;

import java.util.Objects;

/**
 * class User - пользователь.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $2.0$
 * @since 26.03.2020
 */
public class User implements Comparable<User> {
    /**
     * Имя пользователя.
     */
    private String name;
    /**
     * Возраст пользователя.
     */
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(User user) {
        int compare = name.compareTo(user.name);
        return compare == 0 ? age - user.age : compare;
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
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
