package ru.itis.linkedin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.linkedin.services.SearchService;

@Controller
public class SearchController {
    @Autowired
    private SearchService searchService;
    
    @GetMapping("/search")
    public String searchByName(Model model, @RequestParam(name = "text") String name) {
        model.addAttribute("skills", searchService.search(name));
        return "search";
    }
}
