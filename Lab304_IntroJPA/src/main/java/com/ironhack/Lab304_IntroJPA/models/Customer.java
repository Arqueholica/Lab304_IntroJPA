package com.ironhack.Lab304_IntroJPA.models;

import jakarta.persistence.*;

@Entity
public class Customer {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer customerId;
private String customerName;
private Integer totalCustomerMileage;

@Enumerated(EnumType.STRING)
private CustomerStatus customerStatus;

// CONSTRUCTORES

    public Customer() {
    }

    public Customer(String customerName, Integer totalCustomerMileage, CustomerStatus customerStatus) {
        this.customerName = customerName;
        this.totalCustomerMileage = totalCustomerMileage;
        this.customerStatus = customerStatus;
    }

    // GETTERS&SETTERS


    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getTotalCustomerMileage() {
        return totalCustomerMileage;
    }

    public void setTotalCustomerMileage(Integer totalCustomerMileage) {
        this.totalCustomerMileage = totalCustomerMileage;
    }

    public CustomerStatus getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(CustomerStatus customerStatus) {
        this.customerStatus = customerStatus;
    }
}
