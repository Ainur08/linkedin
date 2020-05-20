package ru.itis.linkedin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.itis.linkedin.dto.EducationDto;
import ru.itis.linkedin.dto.SkillDto;
import ru.itis.linkedin.models.Education;
import ru.itis.linkedin.security.details.UserDetailsImpl;
import ru.itis.linkedin.services.ProfileService;
import ru.itis.linkedin.services.ProfileServiceImpl;

import java.util.List;
import java.util.Optional;

@Controller
public class ProfileController {
    @Autowired
    private ProfileService profileService;
    private int count = 1;

    @GetMapping("/profile")
    public String getProfile(Authentication authentication, Model model) {
        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        EducationDto educationDto = profileService.findEducationById(userDetails.getUser().getId());
        if(educationDto.equals(null)){
            count = 2;
        }
        List<SkillDto> skills = profileService.findAllSkillsById(userDetails.getUser().getId());
        if(!skills.equals(null)){
            count = 3;
        }
        model.addAttribute("user", userDetails.getUser());
        model.addAttribute("education", educationDto);
        model.addAttribute("skills", skills);
        model.addAttribute("count", count);
        return "profile";
    }

    @GetMapping("/chat/{userName}")
    public String chat(@PathVariable() String userName, Model model, Authentication authentication) {
        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        model.addAttribute("yourName", userDetails.getUser().getName());
        model.addAttribute("userName", userName);
        return "chat";
    }

    @GetMapping("/user/{userId}")
    public String userPage(@PathVariable() Long userId, Model model){
        model.addAttribute("user", profileService.findUserById(userId));
        model.addAttribute("education", profileService.findEducationById(userId));
        model.addAttribute("skills", profileService.findAllSkillsById(userId));
        return "user";
    }
}
