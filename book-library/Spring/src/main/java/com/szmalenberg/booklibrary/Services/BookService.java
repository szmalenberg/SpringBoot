package com.szmalenberg.booklibrary.Services;


import com.szmalenberg.booklibrary.domain.Book;
import com.szmalenberg.booklibrary.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public List<Book> getBooks() {

        return new ArrayList<>(bookRepository.getBooks());
    }

    public void saveBook(Book book) {
        bookRepository.saveBook(book);
    }

    public void removeBook(int id) {
         bookRepository.removeBook(bookRepository.getBook(id));
    }
    public Book getNewBook(){
        return new Book ();
    }
}
