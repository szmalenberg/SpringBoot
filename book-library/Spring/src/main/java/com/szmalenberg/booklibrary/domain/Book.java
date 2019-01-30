package com.szmalenberg.booklibrary.domain;

import javax.persistence.*;

//@Component
//@Scope("prototype")//zasięg czy moze istniec kilka instancji w kontekscie
@Entity
@Table(name ="book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="bookTitle")
    private String title;
    private String publisher;
    private int year;
    private String isbn;
    private String autor;

    public Book(){
//        this.title = "Ogniem i mieczem";
//        this.year = new Random().nextInt(2000);
//        this.publisher = "Wydawnictwo XYZ";
//        this.isbn = "AZCSDA23";
        this.autor= autor;
    }

    public Book(String title, String publisher, int year, String isbn,String autor) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
        this.isbn = isbn;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
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
