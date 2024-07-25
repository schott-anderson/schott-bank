package com.bank.schott.schott_bank.service;

import com.bank.schott.schott_bank.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate) throws IllegalAccessException;
}
