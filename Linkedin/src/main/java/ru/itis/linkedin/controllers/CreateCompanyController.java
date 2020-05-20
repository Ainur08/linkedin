package ru.itis.linkedin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.linkedin.dto.CompanyDto;
import ru.itis.linkedin.security.details.UserDetailsImpl;
import ru.itis.linkedin.services.CompanyService;

@Controller
public class CreateCompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping("/company")
    public String getPageCompany() {
        return "createCompany";
    }

    @PostMapping("/company")
    public String createCompany(CompanyDto companyDto, Authentication authentication) {
        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        companyService.createCompany(userDetails.getUser(), companyDto);
        return "redirect:/companies";
    }
}
