package com.example.Customer_records.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Customer_records.entity.Customer;
import com.example.Customer_records.service.CustomerService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping
@Api(tags="addCustomer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	@PostMapping("/add")
	public String addCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
		
	}
	@GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable Integer id) {
        Optional<Customer> customer = customerService.getCustomerById(id);
        return customer.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
	@GetMapping("/getalldata")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }
}
