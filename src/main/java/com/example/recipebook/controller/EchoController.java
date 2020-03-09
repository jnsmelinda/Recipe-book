package com.example.recipebook.controller;

import com.example.recipebook.model.EchoResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @GetMapping("/echo/{message}")
    public EchoResponse echo(@PathVariable String message) {
        return new EchoResponse(message);
    }
}
