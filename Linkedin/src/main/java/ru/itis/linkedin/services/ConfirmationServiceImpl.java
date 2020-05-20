package ru.itis.linkedin.services;

import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import freemarker.cache.FileTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;
import ru.itis.linkedin.configs.SenderConfig;
import ru.itis.linkedin.dto.UserDto;
import ru.itis.linkedin.models.State;
import ru.itis.linkedin.models.User;
import ru.itis.linkedin.repositories.UsersRepository;

import java.util.Optional;

@Service
public class ConfirmationServiceImpl implements ConfirmationService {
    @Autowired
    private SenderConfig sender;

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public void send(User user) {
        String mailText = "<a href='http://localhost/activate/" + user.getToken() + "'>Confirm</a>";
        sender.send("Подтверждение аккаунта", mailText, user.getEmail());
    }


    @Override
    public void checkConfirmation(String token) {
        Optional<User> optionalUser = usersRepository.findByToken(token);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setState(State.CONFIRMED);
            usersRepository.save(user);
        }
    }
}
