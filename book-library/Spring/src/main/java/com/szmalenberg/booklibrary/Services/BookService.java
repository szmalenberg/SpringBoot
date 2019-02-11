package com.szmalenberg.booklibrary.Services;


import com.szmalenberg.booklibrary.domain.Author;
import com.szmalenberg.booklibrary.domain.Book;
import com.szmalenberg.booklibrary.repository.AuthorRepository;
import com.szmalenberg.booklibrary.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;
    @Autowired
    AuthorRepository authorRepository;

    public List<Book> getBooks() {

        return new ArrayList<>(bookRepository.getBooks());
    }

    public void saveBook(Book book) {
        if (book != null) {
            System.out.println("zapisuję książkę o id:" + book.getId());
            boolean bookExists = bookRepository.getBook(book.getId()) != null;

            if (bookExists) {
                authorRepository.updateAuthor(book.getAutor());
                bookRepository.updateBook(book);
            } else {
                authorRepository.saveAuthor(book.getAutor());
                bookRepository.saveBook(book);

            }
        }
    }

    public void removeBook(int id) {
        Book bookToRemove = bookRepository.getBook(id);
        Author authorToRemove = bookToRemove.getAutor();

        bookRepository.removeBook(bookToRemove);
        authorRepository.removeAuthor(authorToRemove);
    }

    public Book getNewBook() {
        Book newBook = new Book();
        newBook.setAutor(new Author());
        return newBook;

    }

    public Book getBook(int id) {
        return bookRepository.getBook(id);
    }
}
