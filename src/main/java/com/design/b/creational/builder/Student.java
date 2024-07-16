package com.design.b.creational.builder;

import lombok.Data;

@Data
public class Student {
    private String firstName;
    private String lastName;
    private String rollNumber;
    private String email;
    private String address;

    public Student(StudentBuilder studentBuilder){
        this.firstName=studentBuilder.getFirstName();
        this.lastName=studentBuilder.getLastName();
        this.rollNumber=studentBuilder.getRollNumber();
        this.email=studentBuilder.getEmail();
        this.address=studentBuilder.getAddress();
    }
}
