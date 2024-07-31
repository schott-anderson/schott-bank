package com.bank.schott.schott_bank.service.impl;

import com.bank.schott.schott_bank.model.Account;
import com.bank.schott.schott_bank.model.User;
import com.bank.schott.schott_bank.repository.UserRepository;
import com.bank.schott.schott_bank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

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

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(Long id, User user) {
        User userToUpdate = findById(id);
        userToUpdate.setName(user.getName());
        userToUpdate.setAccount(user.getAccount());
        userToUpdate.setFeatures(user.getFeatures());
        userToUpdate.setNews(user.getNews());
        return userRepository.save(userToUpdate);
    }

    @Override
    public void deleteUser(Long id) {
        User user = findById(id);
        userRepository.delete(user);
    }
}
