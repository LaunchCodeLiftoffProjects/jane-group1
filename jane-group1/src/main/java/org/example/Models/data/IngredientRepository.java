package org.example.Models.data;

import org.example.Models.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IngredientRepository extends CrudRepository<Ingredient, Integer> {

    Ingredient findByIngredient(String ingredient);

}
