package ru.job4j.tracker;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
       Predator predator = new Predator("Predator!!!");
       Tiger tiger = new Tiger("Tiger!!!");
    }
}
