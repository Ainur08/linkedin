package ru.itis.linkedin.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.linkedin.models.Company;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDto {
    private Long id;
    private String name;
    private String country;
    private String activity;

    public static CompanyDto from(Company company) {
        return CompanyDto.builder()
                .id(company.getId())
                .activity(company.getActivity())
                .country(company.getCountry())
                .name(company.getName())
                .build();
    }

    public static List<CompanyDto> from(List<Company> companies) {
        return companies.stream()
                .map(CompanyDto::from)
                .collect(Collectors.toList());
    }
}
