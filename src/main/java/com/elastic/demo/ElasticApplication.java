package com.elastic.demo;

import com.elastic.demo.model.Customer;
import com.elastic.demo.producer.CustomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class ElasticApplication {

    @Autowired
    private CustomeRepository repo;

    @PostMapping("/saveCustomer")

    public int save(@RequestBody List<Customer> customer){
        repo.saveAll(customer);
        return customer.size();
    }

    @GetMapping("/findAll")
    public Iterable<Customer> findAllCustomers() {
        return repo.findAll();
    }

    @GetMapping("/findByFName/{firstName}")
    public List<Customer> findByFirstName(@PathVariable String firstName) {
        return repo.findByFirstname(firstName);
    }



    public static void main(String[] args) {
		SpringApplication.run(ElasticApplication.class, args);
	}

}
