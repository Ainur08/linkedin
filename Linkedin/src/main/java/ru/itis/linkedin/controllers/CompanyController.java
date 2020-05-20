package ru.itis.linkedin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.itis.linkedin.security.details.UserDetailsImpl;
import ru.itis.linkedin.services.CompanyService;

@Controller
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping("/companies")
    public String myCompanies(Model model, Authentication authentication) {
        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        model.addAttribute("companies", companyService.companies(userDetails.getUser().getId()));
        return "companies";
    }

    @GetMapping("/companies/{page}")
    public String myCompanies(@PathVariable() Long page, Model model) {
        model.addAttribute("company", companyService.findCompanyById(page));
        return "company";
    }
}
