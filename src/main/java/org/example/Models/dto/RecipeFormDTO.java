package org.example.Models.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class RecipeFormDTO {

    @NotBlank
    @NotNull
    private String name;

    @NotBlank
    @NotNull
    private String prep_time;

    @NotBlank
    @NotNull
    private String ingredients;

    @NotBlank
    @NotNull
    private String directions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrep_time() {
        return prep_time;
    }

    public void setPrep_time(String prep_time) {
        this.prep_time = prep_time;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }
}
