package com.szmalenberg.booklibrary;

import com.szmalenberg.booklibrary.domain.Book;
import com.szmalenberg.booklibrary.repository.BookRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookLibraryApplicationTests {


    @Autowired
    BookRepository bookRepository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void getBooksByAuthorTest() {
        bookRepository.getBooksByAuthor("Henryk Sienkiewicz");
        Collection<Book> books= bookRepository.getBooksByAuthor("Henryk Sienkiewicz");
        System.out.println(">>>>> "+ books.size());
    }
}

