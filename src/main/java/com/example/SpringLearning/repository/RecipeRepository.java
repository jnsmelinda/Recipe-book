package com.example.SpringLearning.repository;

import com.example.SpringLearning.model.Customer;
import com.example.SpringLearning.model.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "recipes", path = "recipes")
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
    List<Customer> findByName(@Param("name") String name);
}
