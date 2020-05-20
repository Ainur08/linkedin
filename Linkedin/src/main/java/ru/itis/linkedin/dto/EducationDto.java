package ru.itis.linkedin.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.linkedin.models.Company;
import ru.itis.linkedin.models.Education;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EducationDto {
    private Long id;
    private String country;
    private String university;
    private String specialization;

    public static EducationDto from(Education education) {
        return EducationDto.builder()
                .id(education.getId())
                .university(education.getUniversity())
                .country(education.getCountry())
                .specialization(education.getSpecialization())
                .build();
    }

    public static List<EducationDto> from(List<Education> educations) {
        return educations.stream()
                .map(EducationDto::from)
                .collect(Collectors.toList());
    }
}
