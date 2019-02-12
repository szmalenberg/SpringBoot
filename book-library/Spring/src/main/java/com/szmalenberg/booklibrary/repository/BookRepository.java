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

    public Collection<Book> getBooks(){
        return em.createQuery("from Book", Book.class).getResultList();
    }

    public Book getBook(int id){
        return em.find(Book.class, id);
    }

    @Transactional
    public void saveBook(Book book){
        if(book != null)
            em.persist(book);
    }

    @Transactional
    public void updateBook(Book book){
        if(book != null)
            em.merge(book);
    }

    @Transactional
    public void removeBook(Book book) {
        if(book != null)
            em.remove(book);
    }
    public Collection<Book> getBooksByAuthor(String authorName){
        return em.createQuery("SELECT DISTINCT b from Book b INNER JOIN b.author a WHERE a.name =:authorName", Book.class).setParameter("authorName",authorName).getResultList();
}
    }