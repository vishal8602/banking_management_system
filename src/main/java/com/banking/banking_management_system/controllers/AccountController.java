package com.banking.banking_management_system.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.banking.banking_management_system.entity.Account;
import com.banking.banking_management_system.services.AccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class AccountController {
    @Autowired
    private AccountService account_service;

    @PostMapping("/create")
    public Account createAccount(@RequestBody Account account) {
        return account_service.createAccount(account);
    }
}
