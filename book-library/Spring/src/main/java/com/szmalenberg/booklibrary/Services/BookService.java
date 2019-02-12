package com.szmalenberg.booklibrary.Services;


import com.szmalenberg.booklibrary.domain.Author;
import com.szmalenberg.booklibrary.domain.Book;
import com.szmalenberg.booklibrary.repository.AuthorRepository;
import com.szmalenberg.booklibrary.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorRepository authorRepository;

    public List<Book> getBooks(){
        return new ArrayList<>(bookRepository.getBooks());
    }

    public void saveBook(Book book) {
        if (book!=null){
            System.out.println("Zapisuję książkę o id:" + book.getId());
            boolean bookExists = bookRepository.getBook(book.getId())!= null;

            if(bookExists) {
                authorRepository.updateAuthor(book.getAuthor());
                bookRepository.updateBook(book);
            }else {
                authorRepository.saveAuthor(book.getAuthor());
                bookRepository.saveBook(book);
            }
        }
    }

    @Transactional
    public void removeBook(int id){
        Book bookToRemove = bookRepository.getBook(id);
        Author authorToRemove = bookToRemove.getAuthor();
        bookRepository.removeBook(bookRepository.getBook(id));
        authorRepository.removeAuthor(authorToRemove);
    }

    public Book getBook(int id){
        return bookRepository.getBook(id);
    }

    public Book getNewBook() {
        Book newBook = new Book();
        newBook.setAuthor(new Author());
        return newBook;
    }
}
