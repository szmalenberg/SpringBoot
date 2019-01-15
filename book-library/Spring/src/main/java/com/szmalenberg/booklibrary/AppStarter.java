package com.szmalenberg.booklibrary;

import com.szmalenberg.booklibrary.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sun.misc.Contended;


@Component
public class AppStarter implements CommandLineRunner {
    @Autowired //do komponentu wstrzykuj book

    Book book;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(book);
    }
}

