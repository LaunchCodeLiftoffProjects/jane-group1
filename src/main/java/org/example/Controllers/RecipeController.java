package org.example.Controllers;

import org.example.Models.Recipe;
import org.example.Models.data.RecipeRepository;
import org.example.Models.dto.RecipeFormDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
//@RequestMapping("add")
public class RecipeController {

    //    @RequestMapping("")
//    public String addrecipe (Model model) {
//
//        return "addrecipe";
//    }
    @Autowired
    private RecipeRepository recipeRepository;

    @GetMapping("/addrecipe")
    public String addrecipe (Model model) {
        model.addAttribute(new RecipeFormDTO());
        model.addAttribute("title", "Add Your Recipe");
        model.addAttribute("recipe", new Recipe());
        return "addrecipe";
    }

    @PostMapping("/addrecipe")
    public String postrecipe(Model model,Errors errors, @ModelAttribute @Valid Recipe newRecipe) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "create recipe");
            return "addrecipe";
        }


        if (newRecipe.equals("")) {
            recipeRepository.save(newRecipe);
        }
        recipeRepository.save(newRecipe);
        return "addrecipe";
    }

//    @PutMapping("/response")
//    @ResponseBody
//    public String confirmation() {
//        return "Recipe saved!";
//    }

}


//TODO: add recipe mapping to SQL tables. ID fields are name, amount, ingredients, instructions.
//TODO: think about how each ingredient will have a specific amount tied to only it. In contrast one recipe will have many ingredients.

