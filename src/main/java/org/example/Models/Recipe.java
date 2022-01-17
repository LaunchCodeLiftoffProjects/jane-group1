package org.example.Models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Objects;


@Entity
@NotNull
public class Recipe {

   @Id
   @GeneratedValue
   private int id;

   public int getId() {
      return id;
   }


   @Override
   public String toString() {
      return name;
   }
   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Recipe that = (Recipe) o;
      return id == that.id;
   }

   @Override
   public int hashCode() {
      return Objects.hash(id);
   }



//   private String name;
//
//   private HashMap<Ingredient, Integer> ingredients = new HashMap<>();
//
//   private String instructions;



   @NotBlank
   private String name;

   @NotBlank
   private String ingredients;

   @NotBlank
   private String directions;

   @NotBlank
   private String prep_time; //for serving size use

   public Recipe() {}

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
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

   public String getPrep_time() {
      return prep_time;
   }

   public void setPrep_time(String prep_time) {
      this.prep_time = prep_time;
   }
}
