package ru.itis.linkedin.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.linkedin.models.User;
import ru.itis.linkedin.security.details.UserDetailsImpl;
import ru.itis.linkedin.services.ConfirmationService;

@RestController
public class ConfirmationRestController {
    @Autowired
    private ConfirmationService confirmationService;

    @GetMapping("api/activate/{token}")
    public ResponseEntity confirmation(@PathVariable("token") String token) {
        confirmationService.checkConfirmation(token);
        return ResponseEntity.ok().build();
    }

    @GetMapping("api/signUp")
    public ResponseEntity signUp(Authentication authentication) {
        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        confirmationService.send(userDetails.getUser());
        return ResponseEntity.ok().build();
    }
}

