package com.banking.Banking_API.model;

import jakarta.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String streetNumber;
    private String streetName;
    private String city;
    private String state;
    private String zip;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
