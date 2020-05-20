package ru.itis.linkedin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.linkedin.models.Education;

import java.util.Optional;

public interface EducationsRepository extends JpaRepository<Education, Long> {
    Education findEducationByUser_id(Long id);
}
