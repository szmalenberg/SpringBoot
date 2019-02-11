package com.szmalenberg.booklibrary.domain;
import org.hibernate.validator.constraints.Range;
import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

//@Component
//@Scope("prototype")//zasięg czy moze istniec kilka instancji w kontekscie
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "bookTitle")


    @Size(min = 2, message = " Pole musi zawierać co namniej 2 litery")
    @Size(max = 255, message = "Za dużo znaków! Maksymalnie 255.")
    private String title;


    @Size(min = 2, message = " Pole musi zawierać co namniej 2 litery")
    @Size(max = 255, message = "Za dużo znaków! Maksymalnie 255.")
    private String publisher;


    @Range(max = 2019, message = "Nieprawidłowa data! Wpisałeś datę przyszłą!")
    @NotNull(message = "Pole nie moze być puste")
    private Integer year;


    @Size(min = 2, message = "Za mało znaków! Pole musi zawierać co namniej 2 litery")
    @Size(max = 255, message = "Za dużo znaków! Maksymalnie 255.")
    private String isbn;

    @OneToOne
    private @Valid Author autor;

    public Book() {
        this.autor = autor;
    }

    public Book(String title, String publisher, String isbn, Integer year, Author autor) {
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

    public Integer getYear() {
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

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;


    }

    public Author getAutor() {
        return autor;
    }

    public void setAutor(Author autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
