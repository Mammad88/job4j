package ru.job4j.oop;

import ru.job4j.oop.Animal;

public class Predator extends Animal {

    public Predator(String name) {
        super(name);
        System.out.println("Predator!");
    }
}
