package ru.itis.linkedin.services;

import org.springframework.stereotype.Service;
import ru.itis.linkedin.dto.CompanyDto;
import ru.itis.linkedin.models.User;

import java.util.List;

public interface CompanyService {
    void createCompany(User user, CompanyDto companyDto);
    List<CompanyDto> companies(Long user_id);
    CompanyDto findCompanyById(Long id);
}
