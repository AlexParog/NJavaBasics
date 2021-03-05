package com.hwNetology1_5;

public class Book {
    public String title;
    public Author author;
    public int yearOfWriting;
    public int numberOfPages;
    public float rating;

    public static float maxRating = 0;

    public Book(String title, Author author, int yearOfWriting, int numberOfPages, float rating) {
        this.title = title;
        this.author = author;
        this.yearOfWriting = yearOfWriting;
        this.numberOfPages = numberOfPages;
        this.rating = rating;
        maxRating = Math.max(maxRating, rating);
    }

    public boolean isOld() {
        return 2020 - this.yearOfWriting > 15;
    }

    public String toString() {
        return "Название книги: '" + title + '\'' +
                ", Автор: '" + author.name + " " + author.surname + '\'' +
                ", Год написания: " + yearOfWriting +
                ", Количество страниц: " + numberOfPages +
                ", Рейтинг: " + rating;
    }
}
