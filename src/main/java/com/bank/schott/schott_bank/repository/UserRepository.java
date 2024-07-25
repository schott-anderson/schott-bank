package com.bank.schott.schott_bank.repository;

import com.bank.schott.schott_bank.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    boolean existsByAccountNumber(String number);
}
