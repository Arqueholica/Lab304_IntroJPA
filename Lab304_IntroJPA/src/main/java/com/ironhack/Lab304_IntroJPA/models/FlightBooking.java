package com.ironhack.Lab304_IntroJPA.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FlightBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookingId;
    private Integer customerId;
    private Integer flightId;

    public FlightBooking() {
    }

    public FlightBooking(Integer customerId, Integer flightId) {
        this.customerId = customerId;
        this.flightId = flightId;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    @Override
    public String toString() {
        return "FLIGHT BOOKING" + '\n' +
                "Booking Id: " + bookingId + '\n' +
                "Customer Id: " + customerId + '\n' +
                "Flight Id: " + flightId + '\n';
    }
}
