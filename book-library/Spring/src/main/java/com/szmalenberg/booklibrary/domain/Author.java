package com.szmalenberg.booklibrary.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity

public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @Size(min =2, message = "Za mało znaków! Pole musi zawierać co najmniej 2 litery!")
    private String name;

    public Author(String name) {
        this.name = name;
    }
    public Author (){

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
