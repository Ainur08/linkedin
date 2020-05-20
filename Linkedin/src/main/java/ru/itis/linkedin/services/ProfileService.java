package ru.itis.linkedin.services;

import ru.itis.linkedin.dto.EducationDto;
import ru.itis.linkedin.dto.SkillDto;
import ru.itis.linkedin.dto.UserDto;
import ru.itis.linkedin.models.Education;
import ru.itis.linkedin.models.Vacancy;

import java.util.List;
import java.util.Optional;

public interface ProfileService {
    EducationDto findEducationById(Long id);

    List<SkillDto> findAllSkillsById(Long id);

    UserDto findUserById(Long id);
}
