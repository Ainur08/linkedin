package ru.itis.linkedin.services;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.itis.linkedin.dto.SignUpDto;
import ru.itis.linkedin.models.Company;
import ru.itis.linkedin.models.Role;
import ru.itis.linkedin.models.State;
import ru.itis.linkedin.models.User;
import ru.itis.linkedin.repositories.UsersRepository;
import java.time.LocalDateTime;

@Service
public class SignUpServiceImpl implements SignUpService {
    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private ConfirmationService confirmationService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    private User user;

    @Override
    public void signUp(SignUpDto signUpDto) {
        user = User.builder()
                .token(createToken())
                .state(State.NOT_CONFIRMED)
                .name(signUpDto.getName())
                .email(signUpDto.getEmail())
                .hashPassword(passwordEncoder.encode(signUpDto.getPassword()))
                .role(Role.USER)
                .createdAt(LocalDateTime.now())
                .build();
        confirmationService.send(user);
        usersRepository.save(user);
    }

    private String createToken() {
        return RandomStringUtils.random(20, true, true);
    }
}
