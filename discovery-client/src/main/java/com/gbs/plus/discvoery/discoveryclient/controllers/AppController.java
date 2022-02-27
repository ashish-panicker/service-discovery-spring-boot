package com.gbs.plus.discvoery.discoveryclient.controllers;

import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class AppController {

    @Value("${spring.application.name}")
    private String appName;

    @Value("${server.port}")
    private String port;

    @GetMapping(value={"", "/"})
    public ResponseEntity<Map<String, String>> index() {
        Map<String, String> body = Map.of("appName", appName, "port", port);
        return ResponseEntity.ok(body);
    }
    
    
}
