package org.example.Controllers;

import org.example.Models.Ingredient;
import org.example.Models.data.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("addingredients")

public class IngController {

    @Autowired
    IngredientRepository ingredientRepository;


    @RequestMapping("")
    public String addingredients (Model model) {

        return "addingredients";
    }


}

