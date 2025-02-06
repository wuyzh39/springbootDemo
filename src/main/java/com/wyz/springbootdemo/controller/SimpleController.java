package com.wyz.springbootdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping("/hello")
    public <T> ResponseEntity<T> hello() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
