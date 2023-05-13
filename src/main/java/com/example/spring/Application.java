package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private CustomerRepository customerRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) {
        Customer customer1 = new Customer("son", "changwoo");
        Customer customer2 = new Customer("son", "jeehoon");

        // insert
        customerRepository.insert(Arrays.asList(customer1, customer2));

        // get
        List<Customer> result = customerRepository.findByFirstName("testData");
        System.out.println(result);
    }
}
