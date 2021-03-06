package ru.itis.linkedin.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @GetMapping("/admin")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String hello() {
        return "admin";
    }
}
