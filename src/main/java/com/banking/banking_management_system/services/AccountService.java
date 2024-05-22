package com.banking.banking_management_system.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.banking.banking_management_system.DAO.AccountRepository;
import com.banking.banking_management_system.entity.Account;

@Component
public class AccountService {

     @Autowired
     private AccountRepository account_repository;

     public Account createAccount(Account account) {
          return account_repository.save(account);
     }
     public Account getAccount(Integer id){
          return account_repository.findById(id).orElse(null);
     }
     public Account depositAmount(Integer id,Integer amount){
          Account userData=getAccount(id);
          userData.setBalance(userData.getBalance()+amount);
          return account_repository.save(userData);
     }
     public Account withdrawAmount(Integer id,Integer amount){
          Account userData=getAccount(id);
          if(userData.getBalance()>=amount){
               userData.setBalance(userData.getBalance()-amount);
               return account_repository.save(userData);
          }
          return userData;
     }

}
