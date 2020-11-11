package com.sincro.shoppingcart.controller;

import com.sincro.shoppingcart.model.Customer;
import com.sincro.shoppingcart.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ShoppingCartController {

    @Autowired
    public CustomerService customerService;

    @GetMapping("/findAll")
    public List<Customer> getCustomers(){

        List<Customer> customers =  customerService.findAll();

        return  customers;
    }

    @GetMapping("/find/{id}")
    public Customer getCustomerById(@PathVariable("id") Long customerId){

        Customer customer = customerService.findCustomerById(customerId);

        return customer;
    }

    @PostMapping("/post")
    public void postCustomer(){


        Customer customer = customerService.createCustomer();
    }
    @PutMapping("/Customer/{id}")
    public Customer putCustomer(){

        Customer customer = customerService.updateCustomer();

        return customer;
    }

    @DeleteMapping("/delete")
    public void deleteCustomerById(Long customerId){

        customerService.delete(customerId);
    }
}
