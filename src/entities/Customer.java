package entities;

import java.text.DateFormat;
import java.time.LocalDateTime;

public class Customer {
    public int id;
    public String firstName;
    public String lastName;
    public String dateOfBirth;
    public long nationalityId;

    public Customer() {
    }

    public Customer(int id, String firstName, String lastName, String dateOfBirth, int nationalityId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationalityId = nationalityId;
    }
}
