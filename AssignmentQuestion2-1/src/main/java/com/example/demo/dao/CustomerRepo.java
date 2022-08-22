package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Integer>{

}
