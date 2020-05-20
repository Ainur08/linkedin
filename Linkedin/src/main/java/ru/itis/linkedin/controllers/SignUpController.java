package ru.itis.linkedin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.linkedin.dto.SignUpDto;
import ru.itis.linkedin.services.SignUpService;

import javax.validation.Valid;
import java.util.Locale;

@Controller
public class SignUpController {
    @Autowired
    private SignUpService signUpService;

    @GetMapping("/signUp")
    public String getSignUpPage() {
        return "signUp";
    }

    @PostMapping("/signUp")
    public String signUp(@Valid SignUpDto signUpDto, BindingResult bindingResult, Locale locale) {
        if (!bindingResult.hasErrors()) {
            try {
                signUpService.signUp(signUpDto);
                return "redirect:/signIn";
            } catch (Exception e) {
                throw new IllegalArgumentException("Неправильно");
            }
        } return "signUp";
    }
}
