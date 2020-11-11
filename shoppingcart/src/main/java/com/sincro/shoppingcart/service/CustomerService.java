package com.sincro.shoppingcart.service;

import com.sincro.shoppingcart.model.Customer;
import com.sincro.shoppingcart.model.ShoppingCart;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public interface CustomerService {

    private final Map<Long, Customer> customerMap;

    public CustomerService() {
        customerMap = new HashMap<>();
        customerMap.put(1L, new Customer(1L, "Alicia", "Kays"));
        customerMap.put(2L, new Customer(2L, "Emma", "Choplin"));
        customerMap.put(3L, new Customer(3L, "Anna","Carolina"));
    }

      



    Customer save(Customer customer);

    List<Customer> findAll();

    Customer createCustomer();

    Customer updateCustomer();

    void delete(Long customerId);


    Customer findCustomerById(Long customerId);
}
