package ru.itis.linkedin.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.linkedin.dto.VacancyDto;
import ru.itis.linkedin.services.VacancyService;

@RestController
public class VacancyRestController {
    @Autowired
    private VacancyService vacancyService;

    @GetMapping("api/vacancy/{company_id}")
    public ResponseEntity confirmation(@PathVariable("company_id") Long company_id, @RequestBody VacancyDto vacancyDto) {
        vacancyService.createVacancy(vacancyDto, company_id);
        return ResponseEntity.ok().build();
    }
}
