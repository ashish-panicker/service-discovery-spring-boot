package com.gbs.plus.discovery.discoveryproducer.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping({"/", "", "/index"})
    public ResponseEntity<Book> getBook() {
        return ResponseEntity.ok(new Book(1, "123-123-12334", "Spring in Action", "Craig Walls"));
    }

}
