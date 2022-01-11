package org.example.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("fiveheartbeats")
public class FiveHController {

    @RequestMapping("")
    public String fiveheartbeats (Model model) {

        return "fiveheartbeats";
    }

}

