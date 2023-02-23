package com.example.backendexamen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BackendExamenApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendExamenApplication.class, args);
    }

}
