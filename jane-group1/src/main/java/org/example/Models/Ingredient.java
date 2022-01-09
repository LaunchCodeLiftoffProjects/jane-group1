package org.example.Models;


import javax.persistence.Entity;

@Entity
public class Ingredient extends AbstractEntity {

    private String name;

    private int amount;

    public Ingredient(String x, int y) {
        this.name = x;
        this.amount = y;
    }

    public Ingredient(){}

}