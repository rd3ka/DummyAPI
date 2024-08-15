package com.example.SpringDummyAPI.Employee;

import lombok.Getter;

import java.security.SecureRandom;
import java.time.LocalDate;

@Getter
public class Employee {
    private final String FirstName;
    private final String LastName;
    private final String email;
    private final int identification_num;
    private final LocalDate dob;

    public Employee(String firstName, String lastName, LocalDate dob) {
        FirstName = firstName;
        LastName = lastName;
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + "xyz" + ".com";
        this.identification_num = new SecureRandom().nextInt(500000 - 1000) + 1000;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", email='" + email + '\'' +
                ", identification_num=" + identification_num +
                ", dob=" + dob +
                '}';
    }
}
