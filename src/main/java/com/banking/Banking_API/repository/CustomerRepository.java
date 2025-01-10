package com.banking.Banking_API.repository;

import com.banking.Banking_API.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

