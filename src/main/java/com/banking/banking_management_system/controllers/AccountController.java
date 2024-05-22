package com.banking.banking_management_system.controllers;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.banking.banking_management_system.entity.Account;
import com.banking.banking_management_system.services.AccountService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class AccountController {
    @Autowired
    private AccountService account_service;

    @PostMapping("/")
    public Account createAccount(@RequestBody Account account) {
        return account_service.createAccount(account);
    }
    @GetMapping("/{id}")
    public Account getUser(@PathVariable Integer id) {
        return account_service.getAccount(id);
    }

    @PostMapping("/{id}/deposit")
    public Account deposit(@PathVariable Integer id,@RequestBody Map<String,Integer> request) {
        Integer amount=request.get("amount");
        return account_service.depositAmount(id, amount);
    }
    
    @PostMapping("/{id}/withdraw")
    public Account withdraw(@PathVariable Integer id,@RequestBody Map<String,Integer> request) {
        Integer amount=request.get("amount");
        return  account_service.withdrawAmount(id, amount);
    }
    
}
