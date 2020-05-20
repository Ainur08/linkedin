package ru.itis.linkedin.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import ru.itis.linkedin.dto.CompanyDto;
import ru.itis.linkedin.dto.VacancyDto;
import ru.itis.linkedin.security.details.UserDetailsImpl;
import ru.itis.linkedin.services.CompanyService;
import java.util.List;

@RestController
public class CompaniesRestController {
    @Autowired
    private CompanyService companyService;

    @GetMapping("api/companies")
    public List<CompanyDto> getCompanies(Authentication authentication)  {
        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        return companyService.companies(userDetails.getUser().getId());
    }

    @GetMapping("api/companies/{id}")
    public CompanyDto getCompany(@PathVariable("id") Long id)  {
        return companyService.findCompanyById(id);
    }

    @GetMapping("api/company")
    public ResponseEntity createCompany(Authentication authentication, @RequestBody CompanyDto companyDto) {
        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        companyService.createCompany(userDetails.getUser(), companyDto);
        return ResponseEntity.ok().build();
    }
}

// http://localhost/swagger-ui.html

