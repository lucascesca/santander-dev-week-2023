package edu.dio.santanderdevweek2023.service.impl;

import edu.dio.santanderdevweek2023.domain.model.User;
import edu.dio.santanderdevweek2023.domain.repository.UserRepository;
import edu.dio.santanderdevweek2023.service.UserService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User newUser) {
        if (userRepository.existsByAccountNumber(newUser.getAccount().getNumber())) {
            throw new IllegalArgumentException("This account number already exists.");
        }
        return userRepository.save(newUser);
    }
}
