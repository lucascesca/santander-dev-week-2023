package edu.dio.santanderdevweek2023.service;

import edu.dio.santanderdevweek2023.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User newUser);
}
