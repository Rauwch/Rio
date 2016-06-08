/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@XmlRootElement
public class Athlete extends Person {

    double weight;
    double height;
    @OneToMany(mappedBy = "athlete")
    private List<Price> prices;

    public Athlete() {
    }

    public Athlete(String name, String country, String gender, int age, double weight, double height) {
        super(name, country, gender, age);
        this.height = height;
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @XmlTransient
    public List<Price> getPrices() {
        return prices;
    }

    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

   

    public void setHeight(Double height) {
        this.height = height;
    }

}
