package ru.itis.linkedin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.itis.linkedin.services.VacancyService;

@Controller
public class MainController {
    @Autowired
    private VacancyService vacancyService;

    @GetMapping("/main")
    public String myCompanies(Model model) {
        model.addAttribute("vacancies", vacancyService.vacancies());
        return "main";
    }

    @GetMapping("/main/{page}")
    public String myCompanies(@PathVariable() Long page, Model model) {
        model.addAttribute("vacancy", vacancyService.findVacancyById(page));
        return "vacancy";
    }
}
