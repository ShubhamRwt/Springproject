package com.elastic.demo.producer;

import com.elastic.demo.model.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public interface CustomeRepository extends ElasticsearchRepository<Customer, String> {

    List<Customer> findByFirstname(String firstName);
}
