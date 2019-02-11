package com.szmalenberg.booklibrary.repository;

import com.szmalenberg.booklibrary.domain.Author;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class AuthorRepository {
    @PersistenceContext
    private EntityManager em;

    public Author getAuthor(int id) {
        return em.find(Author.class, id);

    }

    @Transactional
    public void saveAuthor(Author autor) {
        if (autor != null)
            em.persist(autor);
    }

    @Transactional
    public void updateAuthor(Author autor) {
        if (autor != null)
            em.persist(autor);

    }
    @Transactional
    public void removeAuthor(Author author){
        if(author !=null)
            em.remove(author);

    }
}
