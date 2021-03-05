package com.hwNetology1_5;

public class User {
    public String email;
    public String name;
    public String surname;
    public Book book;

    public static int totalOnline = 0;

    public User(String email, String name, String surname, Book book) {
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.book = book;
        totalOnline += 1;
    }

    public String toString() {
        return name + " " + surname + " {" + "email: "
                + email + ", используемые книги [" +
                book.author.name + " " + book.author.surname
                + " - " + "'" + book.title + "'"
                + ", " + book.yearOfWriting + " г.]}";
    }
}
