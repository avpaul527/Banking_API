package com.banking.Banking_API.repository;

import com.banking.Banking_API.model.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository {

    List<Account> findAll();

    List<Account> findById(Long accountId);

}
