package com.gbs.plus.discvoery.discoveryclient.controllers;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class AppController {

    @Value("${spring.application.name}")
    private String appName;

    @Value("${server.port}")
    private String port;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private Environment env;

    @GetMapping(value={"", "/"})
    public ResponseEntity<Map<String, String>> index() {
        Map<String, String> body = Map.of("appName", appName, "port", port);
        return ResponseEntity.ok(body);
    }

    @GetMapping(value="/books")
    public ResponseEntity<Book> getBook() {
        // make a call to the service running at 
        // localhost:7070/books
        Book restValue = restTemplate.getForObject("http://DISCOVERY-PRODUCER/books/",  Book.class);
        return ResponseEntity.ok(restValue);
    }
    
    @GetMapping(value="/message")
    public ResponseEntity<String> getMessage() {
        // make a call to the service running at 
        // localhost:7070/books
        String message =env.getProperty("app.message");
        return ResponseEntity.ok(message);
    }
    
}
