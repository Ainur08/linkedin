package ru.itis.linkedin.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.linkedin.dto.UserDto;
import ru.itis.linkedin.repositories.UsersRepository;

@RestController
public class UsersRestController {
    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("api/signIn")
    public UserDto findByEmail(@RequestParam("email") String email) {
        return UserDto.from(usersRepository.findUserByEmail(email).get());
    }

}
