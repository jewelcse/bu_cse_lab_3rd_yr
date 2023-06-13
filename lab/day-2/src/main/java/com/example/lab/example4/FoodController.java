package com.example.lab.example4;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FoodController {


    @Autowired
    @Qualifier("dinner")
    public Cooking cookingService;


    public void getFood(){

        cookingService.cook();

    }
}
