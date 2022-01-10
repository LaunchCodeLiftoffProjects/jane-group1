package org.example.Controllers;

import org.example.Models.data.IngredientRepository;
import org.example.Models.data.RecipeRepository;
import org.example.Models.data.SearchRepository;
import org.example.Models.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class HomeController {

    @Autowired
    private IngredientRepository ingredientRepository;
    @Autowired
    private RecipeRepository recipeRepository;
    @Autowired
    private SearchRepository searchRepository;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/addingredients")



    @RequestMapping("")
    public String index(Model model) {

        model.addAttribute("title", "My Jobs");
        model.addAttribute("jobs", jobRepository.findAll());


        return "index";
}

