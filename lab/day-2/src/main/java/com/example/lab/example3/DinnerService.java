package com.example.lab.example3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class DinnerService {

    @Autowired
    private CookService cookService;


    public void eating(){

        System.out.println("Dinner service");

        System.out.println(cookService.cookingStart());
    }

}
