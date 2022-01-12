package org.example.Models;


import org.example.Models.data.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;


@Entity
public class Ingredient extends AbstractEntity {



//TODO : HOOK THIS UP TO SQL
    @NotNull
    private String ingredient;

    @NotNull
    private int amount;

    public Ingredient(String ingredient, int amount) {
        this.ingredient = ingredient;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Ingredient(){}

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getIngredient() {
        return ingredient;
    }
}































