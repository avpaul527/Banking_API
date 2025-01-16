package com.banking.Banking_API.repository;

import com.banking.Banking_API.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}

