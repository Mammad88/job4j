package ru.job4j.pojo;

public class Book {
   private String author;
   private String name;
   private int countPages;

    public Book(String author, String name, int countPages) {
        this.author = author;
        this.name = name;
        this.countPages = countPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountPages() {
        return countPages;
    }

    public void setCountPages(int countPages) {
        this.countPages = countPages;
    }
}

