package ru.itis.linkedin.services;

import ru.itis.linkedin.dto.SkillDto;
import ru.itis.linkedin.dto.UserDto;

import java.util.List;

public interface SearchService {
    List<SkillDto> search(String name);
}
