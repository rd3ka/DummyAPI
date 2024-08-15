package com.example.SpringDummyAPI.Employee;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {
    @GetMapping
    public List<Employee> response() {
        return List.of(new Employee("Raktim", "Deka", LocalDate.of(1999, 9, 14)));
    }
}
