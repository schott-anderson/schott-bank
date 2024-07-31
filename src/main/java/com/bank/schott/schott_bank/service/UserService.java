package com.bank.schott.schott_bank.service;

import com.bank.schott.schott_bank.model.Account;
import com.bank.schott.schott_bank.model.User;

import java.util.List;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate) throws IllegalAccessException;

    List<User> findAll();

    User updateUser(Long id, User user);

    void deleteUser(Long id);
}
