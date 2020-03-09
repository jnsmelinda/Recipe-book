package com.example.recipebook.model;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;


@Entity
@Getter
@ToString
public class Recipe {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private ArrayList<String> ingredients;
    private String directions;

    protected Recipe() {}

    public Recipe(String name) {
        this.name = name;
    }
}
