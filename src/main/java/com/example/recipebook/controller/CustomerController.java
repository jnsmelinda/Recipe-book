package com.example.recipebook.controller;

import com.example.recipebook.model.Customer;
import com.example.recipebook.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class CustomerController {
    private final CustomerRepository repository;

    @GetMapping("/customers")
    public Iterable<Customer> findAll() {
        return repository.findAll();
    }

    @GetMapping("/customers/{id}")
    public Optional<Customer> findById(@PathVariable long id) {
        return repository.findById(id);
    }

    @PostMapping("/customers")
    public Customer create(@RequestBody Customer customer) {
        return repository.save(customer);
    }

    @PutMapping("/customers")
    public Customer update(@RequestBody Customer customer) {
        return repository.save(customer);
    }

    @DeleteMapping("/customers")
    public void deleteAll() {
        repository.deleteAll();
    }

    @DeleteMapping("/customers/{id}")
    public void deleteById(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
