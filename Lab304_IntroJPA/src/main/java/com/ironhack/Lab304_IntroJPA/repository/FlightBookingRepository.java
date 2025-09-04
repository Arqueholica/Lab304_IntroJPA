package com.ironhack.Lab304_IntroJPA.repository;

import com.ironhack.Lab304_IntroJPA.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightBookingRepository extends JpaRepository<Customer, Integer> {
}
