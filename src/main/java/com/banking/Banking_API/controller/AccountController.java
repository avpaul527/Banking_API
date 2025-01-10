package com.banking.Banking_API.controller;

import com.banking.Banking_API.model.Account;
import com.banking.Banking_API.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    AccountService accountService;

    private final Logger logger = LoggerFactory.getLogger(AccountController.class);

    @GetMapping("/accounts")
    public ResponseEntity<List<Account>> getAllAccounts(){
        logger.info("Successfully returned all accounts.");
        return ResponseEntity.ok(accountService.showAllAccounts());
    }

    @GetMapping("/accounts/{accountId}")
    public ResponseEntity<Account> getAccountById (@PathVariable Long accountId){
        logger.info("Successfully returned account with id of " + accountId + ".");
        return ResponseEntity.ok(accountService.findAccountById(accountId));
    }




}
