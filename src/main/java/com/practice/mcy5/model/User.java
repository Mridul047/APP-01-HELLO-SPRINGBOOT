package com.practice.mcy5.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.UUID;

public class User {

    @NotEmpty
    private String firstName;

    @NotEmpty
    @NotEmpty
    private String lastName;

    @NotNull
    private UUID userId;

    private String subjectSpecialization;
    private String favouriteSport;
    private String country;

    public User(){}

    public User(String firstName, String lastName,String subjectSpecialization,String favouriteSport,String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userId = UUID.randomUUID();
        this.subjectSpecialization= subjectSpecialization;
        this.favouriteSport = favouriteSport;
        this.country = country;
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

    public String getFavouriteSport(){ return  favouriteSport; }
    
    public User withFavouriteSport(String favouriteSport){
        this.favouriteSport = favouriteSport;
        return this;
    }
    
    public String getCountry(){ return country; }
    
    public User withCountry(String country){
        this.country = country;
        return this;
    }
}
