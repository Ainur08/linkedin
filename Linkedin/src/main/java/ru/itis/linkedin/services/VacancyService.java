package ru.itis.linkedin.services;

import ru.itis.linkedin.dto.UserDto;
import ru.itis.linkedin.dto.VacancyDto;

import java.util.List;

public interface VacancyService {
    List<VacancyDto> vacancies();
    VacancyDto findVacancyById(Long id);
    void createVacancy(VacancyDto vacancyDto, Long id);
    UserDto findUserByVacancy_id(Long id);
}
