package com.hwNetology1_5;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Создание Author
        Author author1 = new Author("Джонотан", "Джонсон",
                LocalDate.parse("1990-09-01"), "Англия");
        Author author2 = new Author("Джеймс", "Лоувен",
                LocalDate.parse("1920-01-10"), "Чехия");

        // Создание книги, используя класс Author
        Book characterPath = new Book("Путь характера", author1, 2000, 300, 10);
        Book principles = new Book("Принципы", author2, 2015, 250, 7);
        // Создание User
        User Alex = new User("Alex@mail.ru", "Александр", "Парог", characterPath);
        User Bob = new User("bob13@gmail.com", "Боб", "Пэн", principles);

        // Использование класса Book
        System.out.println(characterPath);
        System.out.println("");
        System.out.println("Максимальный рейтинг в библиотеке: " + "'" + characterPath.title
                + "'" + " - " + Book.maxRating);
        System.out.println("");
        System.out.println("Насколько стара книга?");
        if (characterPath.isOld() == true)
            System.out.println("Книге " + (2020 - characterPath.yearOfWriting) + " лет.");
        else System.out.println("Книга моложе 15 лет.");

        // Использование класса Author
        System.out.println("");
        System.out.println("Полная инфомрация об авторе: " + author1.fullInformationAuthor());

        // Использование класса User
        System.out.println("");
        System.out.println("Информация о пользователе: " + Alex);
        System.out.println("");
        System.out.println("Информация о пользователе: " + Bob);
        System.out.println("");
        System.out.println("Онлайн в данный момент: " + User.totalOnline + " чел.");
    }
}
