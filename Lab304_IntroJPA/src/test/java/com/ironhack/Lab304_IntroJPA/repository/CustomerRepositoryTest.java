package com.ironhack.Lab304_IntroJPA.repository;

import com.ironhack.Lab304_IntroJPA.models.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.ironhack.Lab304_IntroJPA.models.CustomerStatus.GOLD;
import static com.ironhack.Lab304_IntroJPA.models.CustomerStatus.SILVER;
        ;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerRepositoryTest {

   @Autowired
   CustomerRepository customerRepository;

   @Test
   void new_Customer(){
       Customer newCustomer = new Customer("Mari Carmen García", 5682, GOLD);
        customerRepository.save(newCustomer);
   }

    @Test
    void findByCustomerName_correctName() {
        List<Customer> customerName = customerRepository.findByCustomerName("Sam Rio");
        System.out.println(customerName);

    }

    @Test
    void findByCustomerStatus_correctStatus() {
        List<Customer> customerStatusList = customerRepository.findByCustomerStatus(SILVER);

        for (int i = 0; i < customerStatusList.size(); i++) {
            System.out.println(customerStatusList.get(i));

        }

    }
}