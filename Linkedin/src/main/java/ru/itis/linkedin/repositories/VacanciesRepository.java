package ru.itis.linkedin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.linkedin.dto.UserDto;
import ru.itis.linkedin.models.Vacancy;

public interface VacanciesRepository extends JpaRepository<Vacancy, Long> {
    Long findCompany_idById(Long id);
}
