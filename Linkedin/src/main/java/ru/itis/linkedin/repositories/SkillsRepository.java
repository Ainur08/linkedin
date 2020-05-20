package ru.itis.linkedin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.linkedin.models.Company;
import ru.itis.linkedin.models.Skill;

import java.util.List;

public interface SkillsRepository extends JpaRepository<Skill, Long> {
    List<Skill> findAllByName(String name);

    List<Skill> findAllByUser_Id(Long id);
}
