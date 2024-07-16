package com.design.b.creational.builder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BuilderUsage {
    public static void test(){
        Student shubham = new StudentBuilder().withFirstName("Shubham")
                                            .withLastName("Gupta")
                                            .withEmail("shubham@gmail.com")
                                            .withAddress("Datia")
                                            .withRollNumber("22")
                                            .build();
        log.info("\nName: {} {}\nAddress: {}", shubham.getFirstName(), shubham.getLastName(), shubham.getAddress());
    }
}
