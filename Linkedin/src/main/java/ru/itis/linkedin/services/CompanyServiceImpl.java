package ru.itis.linkedin.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.linkedin.dto.CompanyDto;
import ru.itis.linkedin.models.Company;
import ru.itis.linkedin.models.User;
import ru.itis.linkedin.repositories.CompaniesRepository;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompaniesRepository companiesRepository;

    @Override
    public void createCompany(User user, CompanyDto companyDto) {
      companiesRepository.save(Company.builder()
              .name(companyDto.getName())
              .activity(companyDto.getActivity())
              .country(companyDto.getCountry())
              .user(user)
              .build());
    }

    @Override
    public List<CompanyDto> companies(Long user_id) {
        return CompanyDto.from(companiesRepository.findAllByUser_Id(user_id));
    }

    @Override
    public CompanyDto findCompanyById(Long id) {
        return CompanyDto.from(companiesRepository.findById(id).get());
    }
}
