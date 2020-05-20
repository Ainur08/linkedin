package ru.itis.linkedin.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.linkedin.dto.CompanyDto;
import ru.itis.linkedin.dto.UserDto;
import ru.itis.linkedin.dto.VacancyDto;
import ru.itis.linkedin.models.Company;
import ru.itis.linkedin.models.Vacancy;
import ru.itis.linkedin.repositories.CompaniesRepository;
import ru.itis.linkedin.repositories.UsersRepository;
import ru.itis.linkedin.repositories.VacanciesRepository;

import java.util.List;

@Service
public class VacancyServiceImpl implements VacancyService {
    @Autowired
    private VacanciesRepository vacanciesRepository;

    @Autowired
    private CompaniesRepository companiesRepository;

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public UserDto findUserByVacancy_id(Long id) {
        Long company_id = vacanciesRepository.findCompany_idById(id);
        Long user_id = companiesRepository.findUser_idById(company_id);
        return UserDto.from(usersRepository.findById(user_id).get());
    }

    @Override
    public List<VacancyDto> vacancies() {
        return VacancyDto.from(vacanciesRepository.findAll());
    }

    @Override
    public VacancyDto findVacancyById(Long id) {
        return VacancyDto.from(vacanciesRepository.findById(id).get());
    }

    @Override
    public void createVacancy(VacancyDto vacancyDto, Long id) {
        Company company = companiesRepository.findById(id).get();
        vacanciesRepository.save(Vacancy.builder()
                .company(company)
                .description(vacancyDto.getDescription())
                .name(vacancyDto.getName())
                .sale(vacancyDto.getSale())
                .build());
    }
}
