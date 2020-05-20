package ru.itis.linkedin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.linkedin.dto.CompanyDto;
import ru.itis.linkedin.dto.VacancyDto;
import ru.itis.linkedin.security.details.UserDetailsImpl;
import ru.itis.linkedin.services.CompanyService;
import ru.itis.linkedin.services.VacancyService;

@Controller
public class CreateVacancy {
    @Autowired
    private VacancyService vacancyService;

    @GetMapping("/vacancy/*")
    public String getPageCompany() {
        return "addVacancy";
    }

    @PostMapping("/vacancy/{company_id}")
    public String createVacancy(@PathVariable Long company_id, VacancyDto vacancyDto) {
        vacancyService.createVacancy(vacancyDto, company_id);
        return "redirect:/main";
    }
}
