package com.test.demo.service;


import java.util.List;

import com.test.demo.domain.Customer;

public interface CustomerService {
    
    Customer saveCustomer(Customer customer);
    
    void delCustomerById(Long id);
    
    void delAll();
    
    Customer findOneById(Long id);
    
    Customer findByName(String name);

    List<Customer> findByNameAndAge(String name, Integer age);

    Customer queryByName(String name);

}