package ru.itis.linkedin.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.linkedin.dto.SkillDto;
import ru.itis.linkedin.services.SearchService;

import java.util.List;

@RestController
public class SearchRestController {
    @Autowired
    private SearchService searchService;

    @GetMapping("api/search")
    public List<SkillDto> search(@RequestParam("name") String name) {
      return searchService.search(name);
    }
}
