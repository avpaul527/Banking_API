package com.banking.Banking_API.service;

import com.banking.Banking_API.model.Account;
import com.banking.Banking_API.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public List<Account> showAllAccounts(){
        return accountRepository.findAll();
    }

    public Account findAccountById(Long accountId){
        return accountRepository.findById(accountId);
    }


}
