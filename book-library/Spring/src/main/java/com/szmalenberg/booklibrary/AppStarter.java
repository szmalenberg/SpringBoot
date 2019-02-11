package com.szmalenberg.booklibrary;

import com.szmalenberg.booklibrary.Services.BookService;
import com.szmalenberg.booklibrary.domain.Author;
import com.szmalenberg.booklibrary.domain.Book;
import com.szmalenberg.booklibrary.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@PropertySource("classpath:custom.properties")//classpath oznacza zacznik w miejscu gdzie masz program
public class AppStarter implements CommandLineRunner {
    @Autowired
    BookService bookService;

    @Override
    public void run(String... args) throws Exception {
        init();

    }

    public void init() {
        Book book = new Book("Ogniem i mieczem", "wyda.Krakow", "555", 156, new Author("Sienkiewicz"));
        bookService.saveBook(book);



    }
}
