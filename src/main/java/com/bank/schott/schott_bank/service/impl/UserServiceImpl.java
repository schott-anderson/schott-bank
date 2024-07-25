package com.bank.schott.schott_bank.service.impl;

import com.bank.schott.schott_bank.model.User;
import com.bank.schott.schott_bank.repository.UserRepository;
import com.bank.schott.schott_bank.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

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
    public User create(User userToCreate) throws IllegalAccessException {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalAccessException("This Account number already exists");
        }
        return userRepository.save(userToCreate);
    }
}
