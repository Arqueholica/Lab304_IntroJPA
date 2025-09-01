package com.ironhack.Lab304_IntroJPA.models;

import jakarta.persistence.*;

@Entity
public class Customer {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer customerId;
private String customerName;

@Enumerated(EnumType.STRING)
private CustomerStatus customerStatus;

}
