package ru.itis.linkedin.services;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.linkedin.dto.SkillDto;
import ru.itis.linkedin.dto.UserDto;
import ru.itis.linkedin.models.Skill;
import ru.itis.linkedin.repositories.SkillsRepository;
import ru.itis.linkedin.repositories.UsersRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {
    @Autowired
    private SkillsRepository skillsRepository;

    @Autowired
    private UsersRepository usersRepository;

    @Getter
    private final List<UserDto> users = new ArrayList<>();

    @Override
    public List<SkillDto> search(String name) {
        return SkillDto.from(skillsRepository.findAllByName(name));
    }
}
