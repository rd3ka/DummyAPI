package com.example.SpringDummyAPI;

import Employee.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.time.LocalDate;

@SpringBootApplication

@RestController
public class SpringDummyApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDummyApiApplication.class, args);
    }

    @GetMapping
    public Employee response() throws ParseException {
        return new Employee("Raktim", "Deka", LocalDate.of(1999, 9, 14));
    }

}
