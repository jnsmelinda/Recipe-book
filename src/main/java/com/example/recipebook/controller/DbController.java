package com.example.recipebook.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class DbController {
    private final JdbcTemplate jdbcTemplate;

    @GetMapping("db/test")
    public List<Map<String, Object>> test() {
        return jdbcTemplate.queryForList("SELECT * FROM TASKS");
    }
}
