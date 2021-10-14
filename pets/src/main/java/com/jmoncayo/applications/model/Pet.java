package com.jmoncayo.applications.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document("pet")
public class Pet {
    @Id
    private String id;

    private String name;
    private boolean isHouseTrained;
    private LocalDateTime intakeDate;
    private String location;
    private float age;
    private Sex sex;
    private String species;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHouseTrained() {
        return isHouseTrained;
    }

    public void setHouseTrained(boolean houseTrained) {
        isHouseTrained = houseTrained;
    }

    public LocalDateTime getIntakeDate() {
        return intakeDate;
    }

    public void setIntakeDate(LocalDateTime intakeDate) {
        this.intakeDate = intakeDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
