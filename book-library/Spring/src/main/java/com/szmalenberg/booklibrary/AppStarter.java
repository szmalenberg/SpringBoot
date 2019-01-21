package com.szmalenberg.booklibrary;

import com.szmalenberg.booklibrary.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@PropertySource("classpath:custom.properties")//classpath oznacza zacznik w miejscu gdzie masz program
public class AppStarter implements CommandLineRunner {
//    @Autowired //spring sam tworzy obiekt do komponentu wstrzykuj book // mozemy do kontaktu wstrzyknąć obiekt// aby wstrzyknac konstruktor book nie moze miec prametry
//    Book book;
//    Book book2;
//
//    @Value("${spring.pagesize:25}")//:25 to znaczy ze jezeli nie odnajdzie pliku to wartosc 25 bedzie prezentowana
//    Integer size;

    @Override
    public void run(String... args) throws Exception {

    }
}
