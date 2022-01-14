package org.example.Controllers;

import org.example.Models.Ingredient;
import org.example.Models.data.IngredientData;
import org.example.Models.data.IngredientRepository;
import org.example.Models.dto.AddIngredientFormDTO;
import org.example.Models.dto.RegisterFormDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping ("addingredients")
public class IngController {

    @Autowired
    IngredientRepository ingredientRepository;

    @RequestMapping("")
    public String addingredients(Model model) {

        return "addingredients";
    }

  /*  @GetMapping("sendData")
    public String displaysendDataform(Model model) {
        model.addAttribute("title", "Add Ingredient");
        return "addingredients";
    }
  /* @GetMapping("/sendData")
    public String processIngredientData(RequestParam String sendData) {
        return ""
    }  */


    @PostMapping("sendData")
    public String addIngredientData(@RequestParam String ingredient,
            @RequestParam Integer amount) {
        IngredientData.add(new Ingredient(ingredient, amount ));

         return "addingredients";
    }

}
   // @GetMapping("addingredients")
   // public String AddIngredientFormDTO(Model model) {
        //model.addAttribute(new AddIngredientFormDTO());
      //  model.addAttribute("title", "Ingredient");
     //   return "addingredients";}
   // public String processAddUserForm(Model model, @ModelAttribute Ingredient user, Integer amount) {
        // add form submission handling code here
   // }
/*public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
   // add form submission handling code here
}
    @PostMapping("/addingredients")
    public String addIngredientForm(@ModelAttribute @Valid AddIngredientFormDTO addIngredientFormDTO,
                                   Errors errors, HttpServletRequest request,
                                   Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Home");
            return "addingredients";
        }
        Ingredient existingIngredient = ingredientRepository.findByIngredient(addIngredientFormDTO.getIngredient());



        return "addingredients";
    }
*/
  //  }
