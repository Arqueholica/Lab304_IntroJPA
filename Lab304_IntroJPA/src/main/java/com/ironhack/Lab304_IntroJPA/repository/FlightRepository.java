package com.ironhack.Lab304_IntroJPA.repository;

import com.ironhack.Lab304_IntroJPA.models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FlightRepository extends JpaRepository<Flight,Integer> {

    Optional<Flight> findByFlightNumber (String flightNum);
    List<Flight> findAllByAircraftContains(String aircraft);
    List<Flight> findAllByFlightMileageGreaterThan(Integer mileage);



}
