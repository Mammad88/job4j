package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Nimeier P. ","Programmirovanie na Java", 600);
        Book book2 = new Book("Bob Martin. ","Clean Code", 700);
        Book book3 = new Book("Joyce Farrel. ","Java programming", 700);
        Book book4 = new Book("Bryus Ekkel. ","Filosofia Java", 450);

        Book[] books = new Book[4];

        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println("author: " + bk.getAuthor() + "Name: " +
                    bk.getName() + " - " + bk.getCountPages() + " страниц.");
        }

        System.out.println("Replace book1 to book4.");
        book4 = new Book("Bryus Ekkel", "Filosofia Java", 450);
        books[0] = book4;
        books[3] = book1;

        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println("author: " + bk.getAuthor() + "Name: " +
                    bk.getName() + " - " + bk.getCountPages() + " страниц.");
        }
    }
}
