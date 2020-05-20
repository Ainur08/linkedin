package ru.itis.linkedin.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.linkedin.dto.EducationDto;
import ru.itis.linkedin.dto.SkillDto;
import ru.itis.linkedin.dto.UserDto;
import ru.itis.linkedin.models.Education;
import ru.itis.linkedin.repositories.EducationsRepository;
import ru.itis.linkedin.repositories.SkillsRepository;
import ru.itis.linkedin.repositories.UsersRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileServiceImpl implements ProfileService {
    @Autowired
    private EducationsRepository educationsRepository;

    @Autowired
    private SkillsRepository skillsRepository;

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public EducationDto findEducationById(Long id) {
        return EducationDto.from(educationsRepository.findEducationByUser_id(id));
    }

    @Override
    public List<SkillDto> findAllSkillsById(Long id) {
        return SkillDto.from(skillsRepository.findAllByUser_Id(id));
    }

    @Override
    public UserDto findUserById(Long id) {
        return UserDto.from(usersRepository.findById(id).get());
    }
}
