package be.digitcom.user.management.microservice.service;

import be.digitcom.user.management.microservice.model.User;

import java.util.List;

public interface UserService {
    void save(User user);

    User findByUserName(String userName);

    List<String> findUsers(List<Long> idList);
}
