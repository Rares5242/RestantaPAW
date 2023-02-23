package com.example.backendexamen.repository;


import com.example.backendexamen.persitence.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findAll();

    Optional<Book> findById(Long id);
}
