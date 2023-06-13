package com.example.lab;

import com.example.lab.example3.DinnerService;
import com.example.lab.example4.FoodController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LabApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(LabApplication.class, args);

		// first way to get the bean
		//DinnerService dinnerService = applicationContext.getBean(DinnerService.class);

		// second way to get the bean
		//DinnerService dinnerService2 = (DinnerService) applicationContext.getBean("dinnerService");

		// third way to get the bean
		//DinnerService dinnerService3 = (DinnerService) applicationContext.getBean("myDinnerService");

		//System.out.println(dinnerService.eat());
		//System.out.println(dinnerService2.eat());
		//System.out.println(dinnerService3.eat());

		//DinnerService myDinner = applicationContext.getBean(DinnerService.class);

		//myDinner.eating();

		FoodController foodController = applicationContext.getBean(FoodController.class);

		foodController.getFood();

		//No qualifying bean of type 'com.example.lab.example1.DinnerService' available:

	}


}
