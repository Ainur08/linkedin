package ru.itis.linkedin.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.linkedin.models.Company;
import ru.itis.linkedin.models.Vacancy;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VacancyDto {
    private Long id;
    private String name;
    private String description;
    private String sale;

    public static VacancyDto from(Vacancy vacancy) {
        return VacancyDto.builder()
                .id(vacancy.getId())
                .name(vacancy.getName())
                .description(vacancy.getDescription())
                .sale(vacancy.getSale())
                .build();
    }

    public static List<VacancyDto> from(List<Vacancy> vacancies) {
        return vacancies.stream()
                .map(VacancyDto::from)
                .collect(Collectors.toList());
    }
}
