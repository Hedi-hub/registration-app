package registrationForm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import registrationForm.models.User;

@Controller
public class HomePageController {

    @RequestMapping("")
    public String viewHomePage(){
        return "index";
    }

    @RequestMapping("/register")
    public String showSignUpForm(Model model){
        model.addAttribute("user", new User());
        return "signup-form";
    }
}
