package com.example.lab.example4;


import org.springframework.stereotype.Component;

//@Primary
@Component("lunch")
public class LunchService implements Cooking{

    public void eating(){
        System.out.println("Dinner service");
    }

    @Override
    public void cook() {
        System.out.println("cooking started at 1pm");
    }
}
