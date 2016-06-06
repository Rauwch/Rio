/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entities;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Referee extends Person {

    @NotNull
    private int yearOfExperience;
    @Size(min = 1, max = 255)
    private String description;

    public Referee() {
    }

    public Referee(String name, String country, String gender, int age, int yearOfExperience, String description) {
        super(name, country, gender, age);
        this.description = description;
        this.yearOfExperience = yearOfExperience;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    

}
