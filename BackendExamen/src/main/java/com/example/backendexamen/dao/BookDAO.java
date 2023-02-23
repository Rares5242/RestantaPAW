//package com.example.backendexamen.dao;
//
//import com.example.backendexamen.persitence.Book;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.criteria.CriteriaBuilder;
//import jakarta.persistence.criteria.CriteriaQuery;
//import jakarta.persistence.criteria.Root;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class BookDAO {
//
//    private final EntityManager em;
//
//    public BookDAO(EntityManager em) {
//        this.em = em;
//    }
//
//    public List<Book> findProducts() {
//        CriteriaBuilder cb = em.getCriteriaBuilder();
//        CriteriaQuery<Book> cq = cb.createQuery(Book.class);
//        Root<Book> from = cq.from(Book.class);
//        return em.createQuery(cq).getResultList();
//    }
//}
