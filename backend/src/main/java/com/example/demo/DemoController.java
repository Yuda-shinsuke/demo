package com.example.demo; // ← パッケージ名はプロジェクトに合わせて

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String hello() {
        return "Hello, Spring Boot!";
    }
}