package com.practice.mcy5.model;

import java.util.UUID;

public class User {

    private String firstName;
    private String lastName;
    private UUID userId;

    public User(){}

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userId = UUID.randomUUID();
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

}
