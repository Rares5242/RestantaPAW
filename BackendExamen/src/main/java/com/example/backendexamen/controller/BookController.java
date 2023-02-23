package com.example.backendexamen.controller;

//import com.example.backendexamen.dao.BookDAO;
import com.example.backendexamen.model.BookDTO;
import com.example.backendexamen.repository.BookRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class BookController {


    private static Map<Long, BookDTO> productsMap = new HashMap<>();

    final BookRepository bookRepository;

    //final BookDAO productServiceDAO;

    public BookController(BookRepository bookRepository/*, BookDAO bookDAO*/) {
        this.bookRepository = bookRepository;
        //this.productServiceDAO = bookDAO;
    }

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public ResponseEntity<Object> getBooks() {
        List<BookDTO> collect = bookRepository.findAll().stream().map(o -> new BookDTO(o.getId(),o.getName())).collect(Collectors.toList());

        return new ResponseEntity<>(collect, HttpStatus.OK);
    }

}
