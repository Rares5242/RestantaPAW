package com.example.backendexamen.persitence;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "books")
public class Book implements Serializable {
    @Id
    private Long id;
    private String name;

    public Book()
    {

    }

    public Book(Long id, String name)
    {
        this.id=id;
        this.name=name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
