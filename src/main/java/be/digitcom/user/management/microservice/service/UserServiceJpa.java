package be.digitcom.user.management.microservice.service;

import be.digitcom.user.management.microservice.model.User;
import be.digitcom.user.management.microservice.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceJpa implements UserService {
    private final UserRepository repository;
    private PasswordEncoder passwordEncoder;

    public UserServiceJpa(UserRepository repository, PasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void save(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        repository.save(user);
    }

    @Override
    public User findByUserName(String userName) {
        return repository.findByUsername(userName);
    }

    @Override
    public List<String> findUsers(List<Long> idList) {
        return repository.findUserNames(idList);
    }
}
