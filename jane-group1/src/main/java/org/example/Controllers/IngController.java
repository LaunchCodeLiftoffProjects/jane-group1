package org.example.Controllers;

import org.example.Models.Ingredient;
import org.example.Models.User;
import org.example.Models.data.IngredientRepository;
import org.example.Models.dto.AddIngredientFormDTO;
import org.example.Models.dto.LoginFormDTO;
import org.example.Models.dto.RegisterFormDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("addingredients")

public class IngController {

    @Autowired
    IngredientRepository ingredientRepository;


    @RequestMapping("")
    public String addingredients(Model model) {

        return "addingredients";
    }

    @GetMapping("/addingredients")
    public String AddIngredientFormDTO(Model model) {
        model.addAttribute(new AddIngredientFormDTO());
        model.addAttribute("title", "Ingredient");
        return "addingredients";
    }

    @PostMapping("/addingredients")
    public String processLoginForm(@ModelAttribute @Valid AddIngredientFormDTO addIngredientFormDTO,
                                   Errors errors, HttpServletRequest request,
                                   Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Home");
            return "index";
        }

        Ingredient theingredient = ingredientRepository.findByIngredient(AddIngredientFormDTO.getIngredient());


    }

}