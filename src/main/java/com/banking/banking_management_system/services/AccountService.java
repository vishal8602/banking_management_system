package com.banking.banking_management_system.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.banking.banking_management_system.DAO.AccountRepository;
import com.banking.banking_management_system.entity.Account;

@Component
public class AccountService {
     
     @Autowired
     private AccountRepository account_repository;
     public Account createAccount(Account account){
          return account_repository.save(account);
     }
}
