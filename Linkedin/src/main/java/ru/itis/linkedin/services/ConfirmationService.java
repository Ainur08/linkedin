package ru.itis.linkedin.services;


import ru.itis.linkedin.dto.UserDto;
import ru.itis.linkedin.models.User;

public interface ConfirmationService {
    void checkConfirmation(String token);
    void send(User user);
}
