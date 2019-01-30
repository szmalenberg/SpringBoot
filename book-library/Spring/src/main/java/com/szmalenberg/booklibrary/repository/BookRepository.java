package com.szmalenberg.booklibrary.repository;

import com.szmalenberg.booklibrary.domain.Book;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Collection;

@Repository
public class BookRepository {

    @PersistenceContext
    private EntityManager em;

    public Collection<Book> getBooks() {
        return em.createQuery("from Book", Book.class).getResultList();
    }

    public Book getBook(int id) {
        return em.find(Book.class, id);
    }

    @Transactional
    public void saveBook(Book book) {
        if (book != null) {
            em.persist(book);
        }
    }

    @Transactional // w każej motodzie ktora bedzie zapisywać dodajemy tą metodę
    public void updateBook(Book book) {
        if (book != null)
            em.merge(book);
    }

    @Transactional
    public void removeBook(Book book) {
        if (book != null)
            em.remove(book);
    }
}
