package ru.itis.linkedin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.linkedin.models.User;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByEmail(String email);

    Optional<User> findByToken(String token);
}
