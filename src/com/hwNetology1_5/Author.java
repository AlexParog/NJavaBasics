package com.hwNetology1_5;

import java.time.LocalDate;

public class Author {
    public String name;
    public String surname;
    public LocalDate birthDay;
    public String country;

    public Author(String name, String surname, LocalDate birthDay, String country) {
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
        this.country = country;
    }

    public String fullInformationAuthor() {
        return name + " " + surname + " родился в "
                + birthDay + " году" + ", страна - " + country;
    }

    public String toString() {
        return name + " " + surname;
    }
}
