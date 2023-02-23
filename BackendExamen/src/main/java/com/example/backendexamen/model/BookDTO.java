package com.example.backendexamen.model;

public class BookDTO {

    private Long id;
    private String name;

    public BookDTO()
    {

    }
    public BookDTO(Long id, String name)
    {
        this.id=id;
        this.name=name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
}
