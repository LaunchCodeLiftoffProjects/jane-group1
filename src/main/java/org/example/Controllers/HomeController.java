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


    @RequestMapping("")
    public String index() {

        return "index";
}




}

