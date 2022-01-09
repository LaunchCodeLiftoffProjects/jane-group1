package org.example.Models;
import javax.persistence.Entity;
import java.util.HashMap;


@Entity
public class Recipe extends AbstractEntity{

   private String name;

   private HashMap<Ingredient, Integer> ingredients = new HashMap<>();

   private String instructions;

   public Recipe() {}

   public Recipe() {}


}
