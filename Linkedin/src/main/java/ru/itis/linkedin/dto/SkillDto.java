package ru.itis.linkedin.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.linkedin.models.Skill;
import ru.itis.linkedin.models.User;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SkillDto {
    private Long id;
    private String name;
    private String experience;

    public static SkillDto from(Skill skill) {
        return SkillDto.builder()
                .experience(skill.getExperience())
                .name(skill.getName())
                .id(skill.getId())
                .build();
    }

    public static List<SkillDto> from(List<Skill> skills) {
        return skills.stream()
                .map(SkillDto::from)
                .collect(Collectors.toList());
    }
}
