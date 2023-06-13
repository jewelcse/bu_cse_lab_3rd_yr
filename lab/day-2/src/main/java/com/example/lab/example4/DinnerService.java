package com.example.lab.example4;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


//@Primary
@Component("dinner")
public class DinnerService implements Cooking{

    public void eating(){
        System.out.println("Dinner service");
    }

    @Override
    public void cook() {
        System.out.println("cooking started 6pm");

    }
}
