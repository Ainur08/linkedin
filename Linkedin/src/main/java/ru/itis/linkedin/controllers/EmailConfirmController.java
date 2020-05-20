package ru.itis.linkedin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.itis.linkedin.services.ConfirmationService;
import javax.servlet.http.HttpServlet;

@Controller
public class EmailConfirmController extends HttpServlet {
    @Autowired
    private ConfirmationService confirmationService;

    @GetMapping("/activate/{token}")
    public String activate(@PathVariable("token") String token){
        confirmationService.checkConfirmation(token);
        return "redirect:/signIn";
    }
}
