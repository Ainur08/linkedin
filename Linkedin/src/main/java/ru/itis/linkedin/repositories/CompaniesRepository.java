package ru.itis.linkedin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.linkedin.models.Company;

import java.util.List;

public interface CompaniesRepository extends JpaRepository<Company, Long> {
    List<Company> findAllByUser_Id(Long user_id);
    Long findUser_idById(Long company_id);
}
