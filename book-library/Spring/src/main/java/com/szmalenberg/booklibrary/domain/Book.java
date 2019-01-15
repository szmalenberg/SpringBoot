package com.szmalenberg.booklibrary.domain;

import org.springframework.stereotype.Component;

@Component
public class Book {
    private String title;
    private String publisher;
    private int year;
    private String isbn;

    public Book(){
        this.title = "Ogniem i mieczem";
        this.year = 1972;
        this.publisher = "Wydawnictwo XYZ";
        this.isbn = "AZCSDA23";

    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
