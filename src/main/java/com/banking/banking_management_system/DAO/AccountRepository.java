package com.banking.banking_management_system.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.banking.banking_management_system.entity.Account;

@Component
public interface AccountRepository extends JpaRepository<Account,Integer> {
}