package ru.hakaton.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.hakaton.model.Role;
import ru.hakaton.model.User;
import ru.hakaton.repository.UserRepository;

import java.util.HashSet;
import java.util.Set;

@Component
public class InitConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Override
    public void run(String... args) {

        Set<Role> roles = new HashSet<>();
        roles.add(Role.USER);
        User user1 = new User();
        user1.setUsername("username1");
        user1.setLogin("login1");
        user1.setPassword("password1");
        user1.setRoles(roles);
        userRepository.save(user1);


        roles.add(Role.ADMIN);
        User user2 = new User();
        user2.setUsername("username2");
        user2.setLogin("login2");
        user2.setPassword("password2");
        user2.setRoles(roles);


        userRepository.save(user2);
    }
}
