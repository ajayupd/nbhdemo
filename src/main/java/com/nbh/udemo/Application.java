package com.nbh.udemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @GetMapping("/message")
    public String message() {
        return "My First Sample for 2U- NBH Program for Ajay";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("Hello");
    }
}
