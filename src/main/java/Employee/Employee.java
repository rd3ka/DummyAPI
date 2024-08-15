package Employee;

import java.security.SecureRandom;
import java.time.LocalDate;

public class Employee {
    private String FirstName;
    private String LastName;
    private String email;
    private int identification_num;
    private LocalDate dob;

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmail() {
        return email;
    }

    public int getIdentification_num() {
        return identification_num;
    }

    public LocalDate getDob() {
        return dob;
    }

    public Employee(String firstName, String lastName, LocalDate dob) {
        FirstName = firstName;
        LastName = lastName;
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + "xyz" + ".com";
        this.identification_num = new SecureRandom().nextInt(500000-1000) + 1000;
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
