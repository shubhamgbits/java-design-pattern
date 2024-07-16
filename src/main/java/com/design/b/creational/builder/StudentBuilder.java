package com.design.b.creational.builder;

import lombok.Data;

@Data
public class StudentBuilder {
    private String firstName;
    private String lastName;
    private String rollNumber;
    private String email;
    private String address;
    public StudentBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    public StudentBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    public StudentBuilder withEmail(String email) {
        this.email = email;
        return this;
    }
    public StudentBuilder withRollNumber(String rollNumber){
        this.rollNumber = rollNumber;
        return this;
    }
    public StudentBuilder withAddress(String address){
        this.address = address;
        return this;
    }
    public Student build(){
        return new Student(this);
    }
}
