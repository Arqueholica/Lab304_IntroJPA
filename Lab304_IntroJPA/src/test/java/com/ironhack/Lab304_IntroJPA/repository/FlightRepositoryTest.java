package com.ironhack.Lab304_IntroJPA.repository;

import com.ironhack.Lab304_IntroJPA.models.Flight;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class FlightRepositoryTest {

    @Autowired
    FlightRepository flightRepository;


    @Test
    void findByFlightNumber_numberOK() {
        Optional<Flight> flightNumOK = flightRepository.findByFlightNumber("DL53");
        assertTrue(flightNumOK.isPresent());

        Flight oneFlight = flightNumOK.get();

        System.out.println(oneFlight);


    }

    @Test
    void findByAircraft_planeTypeOK() {
        List<Flight> aircraft = flightRepository.findAllByAircraftContains("Boeing");

        System.out.println(aircraft);
    }


    @Test
    void findByMileageMoreThan_MileageOK() {
        List<Flight> mileage = flightRepository.findAllByFlightMileageGreaterThan(500);
        System.out.println(mileage);

    }
}