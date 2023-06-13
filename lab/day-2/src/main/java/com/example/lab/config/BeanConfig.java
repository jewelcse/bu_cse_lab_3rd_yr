package com.example.lab.config;

import com.example.lab.example1.DinnerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class BeanConfig {

    //@Bean
    public DinnerService dinner(){
        return new DinnerService();
    }




}
