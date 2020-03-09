package com.example.SpringLearning.model;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.net.URL;
import java.util.ArrayList;

@Entity
@Getter
@ToString
public class RecipeFancy {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private ArrayList<String> ingredients;
    private String directions;
    private String story;

//    kellene vlasztani opciokbol
    private String cuisine;
    private String difficulty;
    private String diet;
    private int serving;
    private int calorie;
    private URL originalLink;

    protected RecipeFancy() {}

    public RecipeFancy(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
