package org.example.Models;


import org.example.Models.data.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;


@Entity
public class Ingredient extends AbstractEntity {



//TODO : HOOK THIS UP TO SQL

    private String name;

    private int amount;

    public Ingredient(String x, int y) {
        this.name = x;
        this.amount = y;
    }

    public Ingredient(){}

}































