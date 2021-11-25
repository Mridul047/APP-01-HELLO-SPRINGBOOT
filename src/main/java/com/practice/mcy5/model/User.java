package com.practice.mcy5.model;

import java.util.UUID;

public class User {

    private String firstName;
    private String lastName;
    private UUID userId;
    private String subjectSpecialization;

    public User(){}

    public User(String firstName, String lastName,String subjectSpecialization) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userId = UUID.randomUUID();
        this.subjectSpecialization= subjectSpecialization;
    }

    public String getFirstName() {
        return firstName;
    }

    public User withFirstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User withLastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public UUID getUserId() {
        return userId;
    }

    public String getSubjectSpecialization(){ return subjectSpecialization; }

    public User withSubjectSpecialization(String subjectSpecialization){
        this.subjectSpecialization = subjectSpecialization;
        return this;
    }
}
