package ru.itis.linkedin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class SignInController {
    @GetMapping("/signIn")
    public String getSignInPage(Principal principal) {
        if (principal != null) {
            return "redirect:/main";
        }
        return "signIn";
    }
}
